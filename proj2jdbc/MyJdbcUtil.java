package com.java.custmur;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.sql.Statement;

public class MyJdbcUtil {

	static Properties pr = null;
	static DataSource ds;

	static {
		try {
			pr = new Properties();
			// 类加载器得放到包里面
			InputStream filein = MyJdbcUtil.class.getClassLoader().getResourceAsStream("config.properties");
			System.out.println(filein);
			pr.load(filein);
			// pr.load(new FileInputStream("sqldemo5.properties")); //要放到根目录下面
			
			 ds = DruidDataSourceFactory.createDataSource(pr);
			//System.out.println(ds);

		} catch (Exception e) {
			throw new RuntimeException();// 抛出一个运行时异常
		}
		
		
	}

	/**
	 * 登录数据库
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		try {
			//// 加载驱动 注册驱动
			// Class.forName(pr.getProperty("drivermange"));
			// 获得链接
			return ds.getConnection();
		} catch (Exception e) {
			throw new RuntimeException();// 抛出一个运行时异常
		}

	}

	/**
	 * 释放资源
	 * 
	 * @param con
	 * @param st
	 * @param rs
	 */
	public static void release(Connection con, Statement st, ResultSet rs) {
		closeCon(con);
		closeSt(st);
		closeRs(rs);

	}

	/**
	 * 
	 * @param con
	 * @param st
	 */
	public static void release(Connection con, Statement st) {
		closeCon(con);
		closeSt(st);

	}

	/**
	 * 关闭连接
	 * 
	 * @param con
	 */
	public static void closeCon(Connection con) {

		try {
			if (con != null) {// 避免空指针异常
				con.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			//con = null;
		}

	}

	/**
	 * 关闭statement
	 * 
	 * @param st
	 */
	public static void closeSt(Statement st) {

		try {
			if (st != null) {
				st.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			st = null;
		}

	}

	/**
	 * 关闭resultset
	 * 
	 * @param rs
	 */

	public static void closeRs(ResultSet rs) {

		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			rs = null;
		}

	}
	/*
	 * 获得数据库连接池的方法
	 * */
	
	public static DataSource getDataSource(){
		return ds;
	}

}
