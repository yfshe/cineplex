package edu.nju.cineplex.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nju.cineplex.dao.ActivityDao;
import edu.nju.cineplex.model.Activity;

@Repository
public class ActivityDaoImpl extends BaseDaoImpl<Activity> implements ActivityDao{

	public List<Activity> getActivityList(int film_id) {
		String query = "select ac from Activity ac where ac.film_id = ?";
		
		List<Activity> aclist = findByHQL(query, film_id);
		
		return aclist;
	}
	

}
