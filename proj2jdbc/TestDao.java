package com.java.custmur;

import java.sql.Connection;

public class TestDao {
	public static void main(String[] args) {
		Connection con = MyJdbcUtil.getConnection();
		//BiscDao<Customer> bd= new BiscDao<>();
		BiscDaoimp bd= new BiscDaoimp();
		
		Customer customer = new Customer(11,"aa","d",33,"23234","akjf");
		
		
		bd.updatecustomer(customer);
		
		
		
		
		/*String sql="insert into Customer (id,name,gender,age,phone,email)values(?,?,?,?,?,?)";
		//bd.update(con, sql, 1,"kaka","男",22,"11231","als@123");
		System.out.println("---------------------添加客户---------------------");
		System.out.print("\t\tid：");
		Integer id=CMUtility.readInt();
		System.out.print("\t\t姓名：");
		String name=CMUtility.readString(5);
		System.out.print("\t\t性别：");
		String gender=CMUtility.readString(4);
		System.out.print("\t\t年龄：");
		Integer age =CMUtility.readInt();
		System.out.print("\t\t电话：");
		String phone=CMUtility.readString(11);
		System.out.print("\t\t邮箱：");
		String email=CMUtility.readString(32);
		bd.update(con, sql, id,name,gender,age,phone,email);*/
	}


}
