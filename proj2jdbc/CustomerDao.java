package com.java.custmur;

import java.util.List;



public class CustomerDao extends BaseDao{
	//��ѯ�����û�
	public List<Customer> getAllCustomers(){
		String sql = "SELECT id , name , gender , age , tel , email FROM customer";
		return getBeanList(Customer.class, sql);
	}
	//��ѯָ��id���û�
	public Customer getCustomerById(int id) {
		String sql = "SELECT id , name , gender , age , tel , email FROM customer WHERE id = ?";
		return getBean(Customer.class, sql, id);
	}
	//�����û������ݿ�
	public int saveCustomer(Customer customer) {
		String sql = "INSERT INTO Customer2(name , gender , age , tel , email) VALUES(?,? ,? ,? ,?) ";
		return update(sql, customer.getName() , customer.getGender() , customer.getAge() , customer.getPhone(),
				customer.getEmail());
	}
	//����id�޸��û�����
	public int updateCustomerById(Customer customer) {
		String sql = "UPDATE customer SET name=? , gender= ?  , age= ? , tel= ? , email= ? WHERE id = ?";
		return update(sql, customer.getName() , customer.getGender() , customer.getAge() , customer.getPhone(),
				customer.getEmail() , customer.getId());
	}
	//ɾ��id��Ӧ���û�
	public int deleteById(String id) {
		String sql = "DELETE FROM customer WHERE id = ?";
		return update(sql , id);
	}
}
