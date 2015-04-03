package edu.nju.cineplex.dao;

import java.util.List;

import edu.nju.cineplex.model.PlanDate;

public interface PlanDateDao extends BaseDao<PlanDate>{

	List<PlanDate> getUnCheckPlanDate();
	List<PlanDate> getCheckedPlanDate();

}
