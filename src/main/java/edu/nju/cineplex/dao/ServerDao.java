package edu.nju.cineplex.dao;

import edu.nju.cineplex.model.Server;

public interface ServerDao extends BaseDao<Server> {

	public boolean checkLogin(String email, String pw);
	
}
