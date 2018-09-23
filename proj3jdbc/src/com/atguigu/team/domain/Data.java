package com.atguigu.team.domain;

public class Data {
	private int job;
	private String jobname;
	private String status;
	private int id;
	private String name;
	private int age;
	private double salary;
	private double bonus;
	private int stock;
	private int eqm;
	private String ename;
	private String type;
	
	public Data() {
		super();
	}

	public Data(int job, String jobname, String status, int id, String name, int age, double salary, double bonus,
			int stock, int eqm, String ename, String type) {
		super();
		this.job = job;
		this.jobname = jobname;
		this.status = status;
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.bonus = bonus;
		this.stock = stock;
		this.eqm = eqm;
		this.ename = ename;
		this.type = type;
	}

	public int getJob() {
		return job;
	}

	public void setJob(int job) {
		this.job = job;
	}

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public int getEqm() {
		return eqm;
	}

	public void setEqm(int eqm) {
		this.eqm = eqm;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "\t" + id +  "\t" + name+ "\t" + age+ "\t" + salary+"\t" + jobname + "\t" + status 
				  + "\t" + bonus + "\t" + stock + "\t" + ename + "\t" + type ;
	}
	
	

}
