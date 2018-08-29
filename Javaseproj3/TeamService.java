package com.atguigu.team.service;

import java.util.Arrays;

import javax.crypto.spec.DESedeKeySpec;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

public class TeamService {
	private static int counter=1;
	private final static int MAX_MEMBER=5;
	private Programmer[] team=new Programmer[MAX_MEMBER];
	private int total=0;
	public TeamService() {
		super();
	}
	public TeamService(Programmer[] team) {
		super();
		this.team = team;
	}
	
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		TeamService.counter = counter;
	}
	
	public void setTeam(Programmer[] team) {
		this.team = team;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public static int getMaxMember() {
		return MAX_MEMBER;
	}
	
	public Programmer[] getTeam() {
		return Arrays.copyOf(team, total);//只拷贝有数据的数组
	}
	
	public void addMember(Employee e) throws TeamException{
		if(total>=MAX_MEMBER){
			throw new TeamException("成员已满，无法添加");
		}
		//programmer 不满足就不是开发人员
		if(!(e instanceof Programmer)){
			throw new TeamException("该成员不是开发人员，无法添加");
		}
		/*
		for (int i = 0; i < total; i++) {
			if(team[i].getId()==e.getId()){
				throw new TeamException("该员已是团队成员 ");
			}
		}*/
		
		Programmer p=(Programmer) e;
		if(p.getStatus()==Status.BUSY){
			throw new TeamException("该员工已是团队成员 ");
		}
		if(p.getStatus()==Status.VOCATION){
			throw new TeamException("该员正在休假，无法添加 ");
		}
		int pcount=0;
		int dcount=0;
		int acount=0;
		for (int i = 0; i < total; i++) {
			if(team[i] instanceof Architect){
				acount++;
			}
			if(team[i] instanceof Designer){
				dcount++;
			}
			if(team[i] instanceof Programmer){
				pcount++;
			}
			
		}
		if(p instanceof Architect){
			
			if(acount>=1){
				throw new TeamException("团队中只能有一名架构师 ");
			}
		}else if(p instanceof Designer){
			
			if(dcount>=2){
				throw new TeamException("团队中只能有二名设计师 ");
			}
		}else if(p instanceof Programmer){
			
			if(pcount>=3){
				throw new TeamException("团队中只能有三名程序员 ");
			}
		}
		
		p.setStatus(Status.BUSY);
		p.setMemberld(counter++);
		team[total++]=p;
			
			
		
	}
	
	public void removeMember(int memberId) throws TeamException{
		/*if(memberId>=0&&memberId<=total){
			memberId-=1;
			System.arraycopy(team, memberId+1, team, memberId, total-memberId-1);
			team[--total] = null;
		}*/
		int index=-1;
		for (int i = 0; i < total; i++) {
			if(team[i].getMemberld()==memberId){
				index=i;
			}
		}
		if(index==-1){
			throw new TeamException("查无此人");
		}
		team[index].setStatus(Status.FREE);
		System.arraycopy(team, index, team, index+1, total-index-1);
		
		team[--total] = null;
		
	}
	@Override
	public String toString() {
		
		return counter+"/"+team.toString();
	}
	
	
	
}
