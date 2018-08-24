package com.doufu.arrraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomerList {
	
	private ArrayList list;
		
	public CustomerList() {
		super();
	}
	
	public CustomerList(ArrayList list) {
		super();
		this.list = list;
	}
	
	public boolean addCustomer(Customer customer){
		list.add(customer);			
		return true;					
	}

	public boolean replaceCustomer(int index, Customer cust){		
		list.set(index-1, cust);
		return true;		
	}
	
	public boolean deleteCustomer(int index){
		list.remove(index-1);
		return true;		
	}
	
	public ArrayList getAllCustomers(){		
		return list;//只拷贝有数据的数组
	}
	
	public Customer getCustomer(int index){		
		return (Customer)list.get( index-1);		
	}

	

}
