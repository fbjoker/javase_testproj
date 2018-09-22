package com.java.custmur;

import java.sql.Connection;
import java.util.List;

public class BiscDaoimp extends BaseDao {
	// private BaseDao<Customer> bd=new BaseDao<>();

	public int save(Customer customer) {
		Connection con = MyJdbcUtil.getConnection();
		String sql = "INSERT INTO customer VALUES(?,?,?,?,?,?)";

		return update(sql, customer.getId(), customer.getName(), customer.getGender(), customer.getAge(),
				customer.getPhone(), customer.getEmail());
	}

	public int delet(int id) {
		Connection con = MyJdbcUtil.getConnection();
		String sql = "DELETE FROM customer WHERE id=?";

		return update(sql, id);
	}

	public int updatecustomer(Customer customer) {
		/*String sql = "UPDATE customer name=? , gender= ?  , age= ? , tel= ? , email= ? WHERE id = ?";
		
		return update(sql, customer.getName(), customer.getGender(), customer.getAge(), customer.getPhone(),
				customer.getEmail(), customer.getId());*/
		
		String sql = "UPDATE customer SET name=? , gender= ?  , age= ? , phone= ? , email= ? WHERE id = ?";
		return update(sql, customer.getName() , customer.getGender() , customer.getAge() , customer.getPhone(),
				customer.getEmail() , customer.getId());
		
	}

	public Customer getone(int id) {

		String sql = "select * from customer where id=?";
		return getBean(Customer.class, sql, id);
	}

	public List<Customer>  getall() {

		String sql = "select * from customer ";
		return getBeanList(Customer.class, sql );
	}

}
