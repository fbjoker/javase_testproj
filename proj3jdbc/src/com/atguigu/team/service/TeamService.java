package com.atguigu.team.service;

import java.util.Arrays;
import java.util.List;

import com.atguigu.dao.TeamDao;

import com.atguigu.team.domain.TeamData;

public class TeamService {
	TeamDao tbd = new TeamDao();

	// private static int counter=1;
	private final static int MAX_MEMBER = 5;
	

	// private int total=0;
	public TeamService() {
		super();
	}





	public static int getMaxMember() {
		return MAX_MEMBER;
	}

	public List<TeamData> getTeam() {

		return tbd.getAllteam();// 只拷贝有数据的数组
	}

	public void addMember(int id) throws TeamException {
		if (tbd.countTeam() >= MAX_MEMBER) {
			throw new TeamException("成员已满，无法添加");
		}

		// programmer 不满足就不是开发人员

		if (tbd.getJob(id) == 10) {
			throw new TeamException("该成员不是开发人员，无法添加");
		}

		if ("busy".equals(tbd.getStatus(id))) {
			throw new TeamException("该员工已是团队成员 ");
		}
		if ("vocation".equals(tbd.getStatus(id))) {
			throw new TeamException("该员正在休假，无法添加 ");
		}
		int pcount = 0;
		int dcount = 0;
		int acount = 0;
		List<TeamData> allteam = tbd.getAllteam();
		
		for (TeamData teamData : allteam) {
			//System.out.println(teamData.getJobname());
			if ("构架师".equals(teamData.getJobname())) {
				acount++;
			}
			if ("设计师".equals(teamData.getJobname())) {
				dcount++;
			}
			if ("程序员".equals(teamData.getJobname())) {
				pcount++;
			}
		}

		if (tbd.getJob(id) == 13) {

			if (acount >= 1) {
				throw new TeamException("团队中只能有一名架构师 ");
			}
		} else if (tbd.getJob(id) == 12) {

			if (dcount >= 2) {
				throw new TeamException("团队中只能有二名设计师 ");
			}
		} else if (tbd.getJob(id) == 11) {

			if (pcount >= 3) {
				throw new TeamException("团队中只能有三名程序员 ");
			}
		}

		tbd.updateStatusBusy(id);
		tbd.addTeam(id);

	}

	public void removeMember(int id) throws TeamException {
		tbd.deleteTeam(id);
		tbd.updateStatusFree(id);
	}


}
