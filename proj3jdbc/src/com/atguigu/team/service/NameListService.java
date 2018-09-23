package com.atguigu.team.service;

import com.atguigu.team.domain.Data;
import java.util.List;

import com.atguigu.dao.EmployeeDao;



/*
 * 数据库格式CREATE TABLE EMPLOYEES(
		job INT,
		jobname VARCHAR(22),
		`status` VARCHAR(22),
		id INT, 
		NAME  VARCHAR(20), 
		age  INT, 
		salary  DOUBLE, 
		
		bonus DECIMAL, 
		stock INT,
		eqm   INT,
		ename VARCHAR(20),
		`type` VARCHAR(20)
		);
		
DROP TABLE EMPLOYEES;


 INSERT INTO EMPLOYEES (job,id,NAME,age,salary) VALUES  ("10", "1", "段誉", "22", "3000");
 INSERT INTO EMPLOYEES (job,id,NAME,age,salary,bonus,stock,eqm,ename,`type`) VALUES   ("13", "2", "令狐冲", "32", "18000", "15000", "2000","22", "联想Y5", "6000");
    INSERT INTO EMPLOYEES (job,id,NAME,age,salary,eqm,ename,`type`)   VALUES ("11", "3", "任我行", "23", "7000","21", "宏碁 ", "AT7-N52");
    INSERT INTO EMPLOYEES (job,id,NAME,age,salary,eqm,ename,`type`)   VALUES ("11", "4", "张三丰", "24", "7300","21", "戴尔", "3800-R33");
     INSERT INTO EMPLOYEES (job,id,NAME,age,salary,bonus,eqm,ename,`type`) VALUES   ("12", "5", "周芷若", "28", "10000", "5000","23", "激光", "佳能 2900");
     INSERT INTO EMPLOYEES (job,id,NAME,age,salary,eqm,ename,`type`)  VALUES ("11", "6", "赵敏", "22", "6800","21", "华硕", "K30BD-21寸");
     INSERT INTO EMPLOYEES (job,id,NAME,age,salary,bonus,eqm,ename,`type`) VALUES   ("12", "7", "张无忌", "29", "10800","5200","21", "海尔", "18-511X 19");
      INSERT INTO EMPLOYEES (job,id,NAME,age,salary,bonus,stock,eqm,ename,`type`) VALUES  ("13", "8", "韦小宝", "30", "19800", "15000", "2500","23", "针式", "爱普生20K");
     INSERT INTO EMPLOYEES (job,id,NAME,age,salary,bonus,eqm,ename,`type`) VALUES   ("12", "9", "杨过", "26", "9800", "5500","22", "惠普m6", "5800");
     INSERT INTO EMPLOYEES (job,id,NAME,age,salary,eqm,ename,`type`) VALUES  ("11", "10", "小龙女", "21", "6600","21", "联想", "ThinkCentre");
     INSERT INTO EMPLOYEES (job,id,NAME,age,salary,eqm,ename,`type`) VALUES  ("11", "11", "郭靖", "25", "7100","21", "华硕","KBD-A54M5 ");
     INSERT INTO EMPLOYEES (job,id,NAME,age,salary,bonus,eqm,ename,`type`) VALUES   ("12", "12", "黄蓉", "27", "9600", "4800","22", "惠普m6", "5800")
		
   UPDATE EMPLOYEES SET `status`='free';
     UPDATE EMPLOYEES SET jobname='程序员'WHERE job=11;
     UPDATE EMPLOYEES SET jobname='构架师'WHERE job=13;
     UPDATE EMPLOYEES SET jobname='设计师'WHERE job=12;
 SELECT * FROM EMPLOYEES;
 * 
 */

public class NameListService {
	EmployeeDao ebd= new EmployeeDao();

	private List<Data> data;
	
	{
		data= ebd.getAllEmp();
			
		
	}
		
	public NameListService() {
		super();
	}


	
	public List<Data> getAllEmployees(){
		
		return data;
	}
	
	

}
