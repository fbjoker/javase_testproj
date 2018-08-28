package com.atguigu.team.service;

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
	public Programmer[] getTeam() {
		return team;
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
	
	public void addMember(Employee e) throws TeamException{
		
		if(total<MAX_MEMBER){
			team[total++]=(Programmer) e;
			
		}
	}
	
	public void removeMember(int memberId) throws TeamException{
		if(memberId>=0&&memberId<=total){
			memberId-=1;
			System.arraycopy(team, memberId+1, team, memberId, total-memberId-1);
			team[--total] = null;
		}
	}
	
	
	
}
