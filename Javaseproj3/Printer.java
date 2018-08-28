package com.atguigu.team.domain;

public class Printer implements Equipment {
	private String type;
	private String name;
	
	public Printer() {
		super();
	}

	public Printer(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	

	public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDescrption() {

		return "型号:"+type+"\t名称:"+name;
	}

}
