package com.atguigu.dao;

/**
 * 数据库操作的基类方法
 * 	提供基本的增删改查方法
 * @author Administrator
 *
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;



public class BaseDao {
	private QueryRunner runner = new QueryRunner();
	
	/**
	 * 查询一条记录封装为一个对象的方法
	 */
	public <T>T getBean(Class<T> type,String sql , Object...params) {
		Connection conn = JDBCUtils.getConnection();
		//参数1：数据库连接， 参数2：要执行的sql语句 ， 参数4：sql语句执行占位符对应的参数 ， 参数3：工具类对象，将查询到的数据封装位T的实例
		T t = null;
		try {
			t = runner.query(conn, sql, new BeanHandler<>(type), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.closeConnection(conn);
		}
		return t;
	}
	/**
	 * 查询多条记录封装位对象集合的方法
	 */
	public <T>List<T> getBeanList(Class<T> type,String sql , Object...params){
		List<T> list = null;
		Connection conn = JDBCUtils.getConnection();
		try {
			list = runner.query(conn,sql, new BeanListHandler<>(type), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.closeConnection(conn);
		}
		return list;
	}
	/**
	 * 增删改
	 */
	public int  update(String sql , Object...params) {
		int i = 0;
		Connection conn = JDBCUtils.getConnection();
		try {
			i = runner.update(conn, sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.closeConnection(conn);
		}
		return i;
	}
	
	/**
	 * 查询第一行第一类数据的方法
	 */
	public Object getScalar(String sql , Object...params) {
		Object obj = null;
		Connection conn = JDBCUtils.getConnection();
		try {
			obj = runner.query(conn, sql, new ScalarHandler(), params);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.closeConnection(conn);
		}
		
		return obj;
	}
	
	/**
	 * 批量增删改的方法
	 */
	public void batchUpdate(String sql , Object[][]params) {
		Connection conn = JDBCUtils.getConnection();
		try {
			runner.batch(conn, sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtils.closeConnection(conn);
		}
		
	}
	
	
	
	
	
	
	
	
	
}
