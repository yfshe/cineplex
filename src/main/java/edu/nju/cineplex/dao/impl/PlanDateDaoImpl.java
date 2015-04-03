package edu.nju.cineplex.dao.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nju.cineplex.dao.PlanDateDao;
import edu.nju.cineplex.model.PlanDate;

@Repository
public class PlanDateDaoImpl extends BaseDaoImpl<PlanDate> implements PlanDateDao{

	public List<PlanDate> getUnCheckPlanDate() {
		Date date = new Date(new java.util.Date().getTime());
		
		String query = "from PlanDate where plan_date >= ? and state = ?";
		
		List<PlanDate> pdlist = findByHQL(query, date, "n");
		
		return pdlist;
	}

	public List<PlanDate> getCheckedPlanDate() {
		Date date = new Date(new java.util.Date().getTime());
		
		String query = "from PlanDate where plan_date >= ? and state = ?";
		
		List<PlanDate> pdlist = findByHQL(query, date, "y");
		
		return pdlist;
	}

}
