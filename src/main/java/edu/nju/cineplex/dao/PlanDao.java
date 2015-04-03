package edu.nju.cineplex.dao;

import java.sql.Date;
import java.util.List;

import edu.nju.cineplex.model.Plan;

public interface PlanDao extends BaseDao<Plan> {
	
	public List<Plan> getPlanList(Date date);

}
