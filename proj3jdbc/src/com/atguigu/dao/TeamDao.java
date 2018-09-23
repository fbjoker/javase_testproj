package com.atguigu.dao;

import java.util.List;

import com.atguigu.team.domain.Data;
import com.atguigu.team.domain.TeamData;
/*
 *  
 CREATE TABLE Team(
		memberld INT PRIMARY KEY AUTO_INCREMENT,
		id INT, 
		
		NAME  VARCHAR(20), 
		age  INT, 
		salary  DOUBLE, 
		jobname VARCHAR(20), 
		bonus DECIMAL, 
		stock INT
		);
 */

public class TeamDao extends BaseDao {

	public Data getOneData(int id) {
		String sql = "select * from EMPLOYEES where id=?";
		return getBean(Data.class, sql, id);
	}

	public int addTeam(int id) {
		Data data = getOneData(id);

		String sql = "insert into team values(null,?,?,?,?,?,?,?)";

		return update(sql, data.getId(), data.getName(), data.getAge(), data.getSalary(), data.getJobname(),
				data.getBonus(), data.getStock());

	}

	public List<TeamData> getAllteam() {
		String sql = "select * from team";
		return getBeanList(TeamData.class, sql);
	}

	public int countTeam() {
		return getAllteam().size();

	}

	public int getJob(int id) {
		String sql = "select job from EMPLOYEES where id=?";
		Object scalar = getScalar(sql, id);
		return (int) scalar;
	}

	public String getStatus(int id) {
		String sql = "select status from EMPLOYEES where id=?";
		Object scalar = getScalar(sql, id);
		return (String) scalar;
	}

	public int updateStatusBusy(int id) {
		String sql = "update EMPLOYEES set status='busy' where id=?";
		return update(sql, id);
	}
	public int updateStatusFree(int id) {
		String sql = "update EMPLOYEES set status='free' where id=?";
		return update(sql, id);
	}
	
	public int deleteTeam(int id) {
		String sql = "delete from team where id=?";
		return update(sql, id);
	}
}
