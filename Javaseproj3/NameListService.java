package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Equipment;
import com.atguigu.team.domain.NoteBook;
import com.atguigu.team.domain.Pc;
import com.atguigu.team.domain.Printer;
import com.atguigu.team.domain.Programmer;

public class NameListService {
	private Employee[] employee;
	
	{
		employee=new Employee[Data.EMPLOYEES.length-1];
		for (int i = 0; i < employee.length; i++) {
			// 这里因为都是相同的可以都拿出来，减少代码量；
			int id=Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name=Data.EMPLOYEES[i][2];
			int age=Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary= Double.parseDouble(Data.EMPLOYEES[i][4]);
			
			switch(Data.EMPLOYEES[i][0]){
			case "10":
				
				employee[i]=new Employee(id, name, age, salary);
				break;
			case "11":
				
				employee[i]=new Programmer(id, name, age, salary,getEquipment(i));
				break;
			case "12":
				double bonus= Double.parseDouble(Data.EMPLOYEES[i][5]);
				employee[i]=new Designer(id, name, age, salary,getEquipment(i),bonus);
				break;
			case "13":
				double b= Double.parseDouble(Data.EMPLOYEES[i][5]);
				int stock=Integer.parseInt(Data.EMPLOYEES[i][5]);
				employee[i]=new Architect(id, name, age, salary,getEquipment(i),b,stock);
				break;
				
			}
			
		}
	}
		
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
	
	public Equipment getEquipment(int index){
		switch(Data.EQIPMENTS[index][0]){
			case "21":
				String model=Data.EQIPMENTS[index][1];
				String display=Data.EQIPMENTS[index][2];
				return new Pc(model, display);
				
			case "22":
				String m=Data.EQIPMENTS[index][1];
				double price=Double.parseDouble(Data.EQIPMENTS[index][2]);
				return new NoteBook(m, price);
				
			case "23":
				String type=Data.EQIPMENTS[index][1];
				String name=Data.EQIPMENTS[index][2];
				return new Printer(type, name);
				
			default:
				return null;
			
			
		
		}
	}
	public Employee[] getAllEmployees(){
		
		return employee;
	}
	
	public Employee getEmployee(int id) throws TeamException{
		int index=-1;
		for (int i = 0; i < employee.length; i++) {
			if(employee[i].getId()==id){
				index=i;
			}
		}
		
		if(index==-1){
			throw new TeamException("查无此人：");
		}
		
		return employee[index];
	}

}
