package com.atguigu.team.domain;

public class TeamData {
	private int memberid;
	//private int job;
	private int id;
	private String name;
	private int age;
	private double salary;
	private String jobname;
	private double bonus;
	private int stock;

	public TeamData() {
		super();
	}

	public TeamData(int memberid,  int id, String name, int age, double salary, String jobname, double bonus,
			int stock) {
		super();
		this.memberid = memberid;
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.jobname = jobname;
		this.bonus = bonus;
		this.stock = stock;
	}

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return  "\t" +memberid + "/"  + id + "\t" + name + "\t" + age + "\t" + salary + "\t" + jobname + "\t" + bonus + "\t"
				+ stock;
	}

}
