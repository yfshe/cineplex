package edu.nju.cineplex.dao.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nju.cineplex.dao.PlanDao;
import edu.nju.cineplex.model.Plan;

@Repository
public class PlanDaoImpl extends BaseDaoImpl<Plan> implements PlanDao{

	public List<Plan> getPlanList(Date date) {
		String query = "from Plan where plan_date = ?";
		
		List<Plan> plist = findByHQL(query, date);
		
		return plist;
	}

}
