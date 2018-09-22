package com.java.custmur;

import java.util.Arrays;

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
			this.customer[total]=customer;//customer[total++]=customer的写法更加巧妙
			total++;
			return true;
		}else{
			System.out.println("已满员，无法添加！！");
			return false;
		}
		
	}
	public boolean replaceCustomer(int index, Customer cust){
		if(index>=0&&index<this.total){
			this.customer[index]=cust;
			return true;
		}else{
			System.out.println("索引无效，无法替换");
			return false;
		}
		
	}
	public boolean deleteCustomer(int index){
		if(index>=0&&index<=this.total){
			/*this.customer[index]=null;
			return true;*/
			
			//把index = [id-1]后面的元素往前移动
			index -=1;
			//新介绍一个方法
			//本数组中移动元素，也称为本数组内复制
			/*
			 * 第一个：要移动的数组名
			 * 第二个：从哪个下标开始移动
			 * 第三个：移动到哪个数组中
			 * 第四个：目标的起始位置
			 * 第五个：一共要移动几个*/
			System.out.println(customer[index].getInfo());
			System.arraycopy(customer, index+1, customer, index, total-index-1);
			customer[--total] = null;
			return true;
		}else{
			System.out.println("索引无效，无法替换");
			return false;
		}
	}
	public Customer[] getAllCustomers(){
		//return customer;
		return Arrays.copyOf(customer, total);//只拷贝有数据的数组
	}
	public Customer getCustomer(int index){
		if(index<0 || index>total){
			System.out.println(index + "对应的客户不存在");
			return null;
		}
		return customer[index];
		
	}

	

}
