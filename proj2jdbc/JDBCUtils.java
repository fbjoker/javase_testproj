package com.java.custmur;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

public class JDBCUtils {
	//���ݿ����ӳ�
	private static DataSource source ;
	static {
		Properties properties = new Properties();
		InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("config.properties");
		try {
			properties.load(is);
			source = DruidDataSourceFactory.createDataSource(properties );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// ��ȡ���ݿ�����
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = source.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	// �ͷ����ݿ�����
	public static void closeConnection(Connection conn) {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
