package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

public class Programmer extends Employee {
	private int memberld;
	private Status status=Status.FREE;
	private Equipment equipment;
	
	public Programmer() {
		super();
	}

	public Programmer(int id, String name, int age, double salary, Equipment equipment) {
		super(id, name, age, salary);
		
		this.equipment = equipment;
	}
	

	public Programmer(int id, String name, int age, double salary, int memberld, Status status, Equipment equipment) {
		super(id, name, age, salary);
		this.memberld = memberld;
		this.status = status;
		this.equipment = equipment;
	}

	public int getMemberld() {
		return memberld;
	}

	public void setMemberld(int memberld) {
		this.memberld = memberld;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	@Override
	public String toString() {
		
		return "\t" + this.getId() + "\t" + this.getName() +
				"\t" + this.getAge() + "\t" + this.getSalary() +
				"\t程序员\t"+this.getStatus()+"\t\t\t"+this.getEquipment().getDescrption();
	}
	public String toString2() {
		
		return "\t" + this.getMemberld()+"/"+this.getId() + "\t" + this.getName() +
				"\t" + this.getAge() + "\t" + this.getSalary() +
				"\t程序员";
	}
	

}
