package com.atguigu.team.service;

import com.atguigu.team.domain.Employee;

public class NameListService {
	private Employee[] employee;
		
	public NameListService() {
		super();
	}

	public NameListService(Employee[] employee) {
		super();
		this.employee = employee;
	}

	public Employee[] getEmployee() {
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}
	
	public Employee[] getAllEmployees(){
		
		return employee;
	}
	
	public Employee getEmployee(int id) throws TeamException{
		return employee[id-1];
	}

}
