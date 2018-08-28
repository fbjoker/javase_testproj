package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

public class Architect extends Designer {
	private int stock;

	public Architect() {
		super();
	}

	public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}

	public Architect(int id, String name, int age, double salary, int memberld, Status status, Equipment equipment,
			double bonus, int stock) {
		super(id, name, age, salary, memberld, status, equipment, bonus);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		
		return "\t" + this.getId() + "\t" + this.getName() +
				"\t" + this.getAge() + "\t" + this.getSalary() +
				"\t设计师\t"+this.getStatus()+"\t"+this.getBonus()+
				"\t"+this.getStock()+"\t"+this.getEquipment();
	}
	
}
