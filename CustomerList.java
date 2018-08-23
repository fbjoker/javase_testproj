package com.doufu.bean;

public class CustomerList {
	private Customer[] customer;
	private int total=0;
	
	public CustomerList() {
		super();
	}

	public CustomerList(int totalCustomer) {
		super();
		this.customer = new Customer[totalCustomer];
		
	}

	public Customer[] getCustomer() {
		return customer;
	}

	public void setCustomer(Customer[] customer) {
		this.customer = customer;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	public boolean addCustomer(Customer customer){
		if(this.total<this.customer.length){
			this.customer[total]=customer;
			total++;
			return true;
		}else{
			System.out.println("已满员，无法添加！！");
			return false;
		}
		
	}
	public boolean replaceCustomer(int index, Customer cust){
		if(index>0&&index<this.total){
			this.customer[index]=cust;
			return true;
		}else{
			System.out.println("索引无效，无法替换");
			return false;
		}
		
	}
	public boolean deleteCustomer(int index){
		if(index>0&&index<this.total){
			this.customer[index]=null;
			return true;
		}else{
			System.out.println("索引无效，无法替换");
			return false;
		}
	}
	public Customer[] getAllCustomers(){
		return customer;
	}
	public Customer getCustomer(int index){
		return customer[index];
		
	}

	

}
