package com.atguigu.dao;

import java.sql.Connection;
import java.util.List;

import javax.xml.ws.WebServiceProvider;

import com.atguigu.team.domain.Data;

@SuppressWarnings("all")
public class EmployeeDao extends BaseDao{
/*	public static void main(String[] args) {
		
		Connection con = JDBCUtils.getConnection();
		EmployeeDao ebd = new EmployeeDao();
		//ebd.getAlleEmp();
		
	}*/
	public List<Data> getAllEmp(){
		String sql="select * from EMPLOYEES";
		return getBeanList(Data.class, sql);
	}
	
	public int getJob(int id){
		String sql="select job from EMPLOYEES where id=?";
		Object scalar = getScalar(sql,id);
		return (int)scalar;
	}
	
	
	
	
	
	

}
