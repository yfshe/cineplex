package edu.nju.cineplex.dao;

import edu.nju.cineplex.model.Manager;

public interface ManagerDao extends BaseDao<Manager> {

	public boolean checkLogin(String email, String pw);
	
}
