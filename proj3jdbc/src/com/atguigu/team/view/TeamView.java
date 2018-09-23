package com.atguigu.team.view;


import com.atguigu.team.domain.Data;
import com.atguigu.team.domain.TeamData;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import com.atguigu.team.service.TeamService;

public class TeamView {
	private NameListService listSvc=new NameListService();
	private TeamService teamSvc=new TeamService();
	
		
		
	
	
	public void enterMainMenu (){
		
		
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)： _");
	}
	private void listAllEmployees (){
		for(Data e:listSvc.getAllEmployees()){
			System.out.println(e.toString());
		}
	}
	private void listTeamEmployees(){
		System.out.println("--------------------团队成员列表---------------------");
		System.out.println("\tTDI//ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
		for(TeamData e:teamSvc.getTeam()){
			
			System.out.println(e.toString());
		}
		/*System.out.println("--------------------------------------------------");
		System.out.println("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)： _");*/
		
		
	}
	
	private void addMember() {
		System.out.println("-------------------------------------开发团队调度软件--------------------------------------");
		System.out.println("\tID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
		listAllEmployees ();
		//System.out.println("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
		System.out.println("---------------------添加成员---------------------");
		System.out.println("请输入要添加的员工ID:");
		int select=TSUtility.readInt();
			
		try {
			this.teamSvc.addMember(select);
			System.out.println("添加成功");
			
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
		
		//System.out.println("按回车键继续...");
		TSUtility.readReturn();

	}
	private void deleteMember(){
		System.out.println("---------------------删除成员---------------------");
		System.out.println("请输入要删除的员工的TID：（团队编号）");
		int select=TSUtility.readInt();
		
		System.out.println("确认是否删除(Y/N)：");
		char confirm=TSUtility.readConfirmSelection();
		if(confirm=='y'||confirm=='Y'){
			try {
				this.teamSvc.removeMember(select);
			} catch (TeamException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("删除成功");
			TSUtility.readReturn();
			
		}else{
			
			System.out.println("取消删除");
			TSUtility.readReturn();
		}
		
		
		
	}
	
	
	public static void main(String[] args)  {
		TeamView tv= new TeamView();
		System.out.println("-------------------------------------开发团队调度软件--------------------------------------");
		System.out.println("\tID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
		tv.listAllEmployees ();
		
		while(true){
			tv.enterMainMenu();
			char menuSelection=TSUtility.readMenuSelection();
			
			switch(menuSelection){
				case '1':
					tv.listTeamEmployees();
					break;
				case '2':
					tv.addMember();
					break;
				case '3':
					tv.deleteMember();
					break;
				case '4':
					System.out.println("确认退出(Y/N):");
					char confirm=TSUtility.readConfirmSelection();
					if(confirm=='y'||confirm=='Y'){
						return;
					}
					System.out.println("取消退出！！");
					break;
			}
			
		}
		
	}

}
