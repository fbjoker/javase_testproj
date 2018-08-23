package com.doufu.bean;

public class TestCustomer {
	public static void main(String[] args) {
		Customer customer = new Customer("卡卡",'男',22,"454545","234234@");
		
		System.out.println(customer.getAge());
		System.out.println(customer.getEmail());
		System.out.println(customer.getGender());
		System.out.println(customer.getName());
		System.out.println(customer.getPhone());
	}

}
