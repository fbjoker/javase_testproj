package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

public class Designer extends Programmer {
	private double bonus;

	public Designer() {
		super();
	}
	
	public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
		super(id, name, age, salary, equipment);
		this.bonus = bonus;
	}

	public Designer(int id, String name, int age, double salary, int memberld, Status status, Equipment equipment,
			double bonus) {
		super(id, name, age, salary, memberld, status, equipment);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		
		return "\t" + this.getId() + "\t" + this.getName() +
				"\t" + this.getAge() + "\t" + this.getSalary() +
				"\t设计师\t"+this.getStatus()+"\t"+bonus+"\t\t"+this.getEquipment();
	}
	
	

}
