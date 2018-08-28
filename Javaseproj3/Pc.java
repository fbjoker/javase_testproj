package com.atguigu.team.domain;

public class Pc implements Equipment {
	private String model;
	private double display;
	

	public Pc() {
		super();
	}


	public Pc(String model, double display) {
		super();
		this.model = model;
		this.display = display;
	}
	


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getDisplay() {
		return display;
	}


	public void setDisplay(double display) {
		this.display = display;
	}


	@Override
	public String getDescrption() {

		return "型号:"+model+"\t显示器名称:"+display;
	}

}
