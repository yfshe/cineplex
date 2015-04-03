package edu.nju.cineplex.dao;

import java.util.List;

import edu.nju.cineplex.model.Activity;

public interface ActivityDao extends BaseDao<Activity> {

	public List<Activity> getActivityList(int film_id);

}
