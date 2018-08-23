package com.doufu.bean;

public class CustomerView {
	CustomerList customers = new CustomerList(10);
	
	public static void main(String[] args) {
		CustomerView cv=new CustomerView();
		cv.enterMainMenu();
		
		

		
	}
	
	
	
	public void enterMainMenu(){
		while(true){
			System.out.println("-----------------客户信息管理软件-----------------");
	        System.out.println("\t");
	        System.out.println("\t\t1 添 加 客 户");
	        System.out.println("\t\t2 修 改 客 户");
	        System.out.println("\t\t3 删 除 客 户");
	        System.out.println("\t\t4 客 户 列 表");
	        System.out.println("\t\t5 退           出");
	        System.out.println("\t");
	        System.out.print("\t请选择(1-5)：_");
	        
	        char input=CMUtility.readMenuSelection();
	        switch(input){
	        	case '1':
	        		addNewCustomer();
	        		break;
	        	case '2':
	        		modifyCustomer();
	        		break;
	        	case '3':
	        		deleteCustomer();
	        		break;
	        	case '4':
	        		listAllCustomers();
	        		break;
	        	case '5':
	        		System.out.println("是否确认退出？Y 确认  /N  取消");
	        		char eq=CMUtility.readConfirmSelection()  ;
	        		if(eq=='y'||eq=='Y'){
	        			System.exit(0);
	        		}else if(eq=='n'||eq=='N'){
	        			System.out.println("取消退出");
	        		}
	        		
	        		
	        }

		
	}
	}
	private void addNewCustomer(){
		Customer c = new Customer();
		System.out.println("\t---------------------添加客户---------------------");
		System.out.print("\t\t姓名：");
		c.setName(CMUtility.readString(5));
		System.out.print("\t\t性别：");
		c.setGender(CMUtility.readChar());
		System.out.print("\t\t年龄：");
		c.setAge(CMUtility.readInt());
		System.out.print("\t\t电话：");
		c.setPhone(CMUtility.readString(11));
		System.out.print("\t\t邮箱：");
		c.setEmail(CMUtility.readString(15));
		customers.addCustomer(c);
		System.out.println("---------------------添加完成---------------------");

		
		
	}
	private void modifyCustomer(){
		Customer c = new Customer();
		System.out.println("---------------------修改客户---------------------");
		System.out.println("请选择待修改客户编号(-1退出)：");
		int index=CMUtility.readInt()-1;
		
		System.out.println("姓名("+customers.getCustomer(index).getName()+")：<直接回车表示不修改>");
		c.setName(CMUtility.readString(4, customers.getCustomer(index).getName()));
		System.out.println("性别("+customers.getCustomer(index).getGender()+")：");
		c.setGender(CMUtility.readChar(customers.getCustomer(index).getGender()));
		System.out.println("年龄("+customers.getCustomer(index).getAge()+")：");
		c.setAge(CMUtility.readInt(customers.getCustomer(index).getAge()));
		System.out.println("电话("+customers.getCustomer(index).getPhone()+")：");
		c.setPhone(CMUtility.readString(11, customers.getCustomer(index).getPhone()));
		System.out.println("邮箱("+customers.getCustomer(index).getEmail()+")：");
		c.setEmail(CMUtility.readString(20, customers.getCustomer(index).getEmail()));
		customers.replaceCustomer(index, c);
		System.out.println("---------------------修改完成---------------------");

		
	}
	//删除的元素为NULL的时候就没办法处理优化方法？？
	private void deleteCustomer(){
		
		System.out.println("---------------------删除客户---------------------");
		System.out.println("请选择待删除客户编号(-1退出)：");
		int index=CMUtility.readInt();
		System.out.println("确认是否删除(Y/N)：");
		char flag=CMUtility.readChar();
			if(flag=='y'||flag=='Y'){
				customers.deleteCustomer(index);
			}else if(flag=='n'||flag=='N'){
				return;
			}
		
		System.out.println("---------------------删除完成---------------------");

		
	}
	//不够10个元素的时候报错空指针怎么处理
	private void listAllCustomers(){
		Customer[] list=customers.getAllCustomers();
		//+name+"\t"+age+"\t"+gender+"\t"+phone+"\t"+email;
		System.out.println("姓名："+"\t年龄："+"\t性别："+"\t电话："+"\t邮箱：");
		for(int i=0;i<customers.getTotal();i++){
			System.out.println(list[i].getInfo());
		}
		
	}
	

}
