package com.doufu.bean;

public class TestList {
	public static void main(String[] args) {
		Customer customer = new Customer("卡卡",'男',22,"454545","234234@");
		CustomerList cl=new CustomerList(5);
		cl.addCustomer(customer);
		cl.addCustomer(new Customer("卡卡1",'男',23,"454545","234234@"));
		cl.addCustomer(new Customer("卡卡2",'男',23,"454545","234234@"));
		cl.addCustomer(new Customer("卡卡3",'男',23,"454545","234234@"));
		
		
		cl.replaceCustomer(2, new Customer("卡卡4",'男',23,"454545","234234@"));
		
		cl.deleteCustomer(3);
		
		Customer[] c2=cl.getAllCustomers();
		Customer aa=cl.getCustomer(1);
		
		System.out.println(aa.getInfo());
		System.out.println("--------------------");
		
		for(int i =0;i<c2.length;i++){
			System.out.println(c2[i].getInfo());
		}
		
	}
	

}
