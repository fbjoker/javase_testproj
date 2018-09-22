package com.java.custmur;

import org.junit.Test;



public class Customer {
	private Integer id;
	private String name;
	private String gender;
	private Integer age;
	private String phone;
	private String email;
	
	
	public Customer() {
		super();
	}


	
	
	public Customer(Integer id, String name, String gender, Integer age, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public Integer getAge() {
		return age;
	}




	public void setAge(Integer age) {
		this.age = age;
	}




	public String getPhone() {
		return phone;
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getInfo(){
		return ""+id+"\t"+name+"\t"+age+"\t"+gender+"\t"+phone+"\t"+email;
	}
	
	
	

}
