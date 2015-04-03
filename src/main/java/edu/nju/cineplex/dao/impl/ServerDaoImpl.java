package edu.nju.cineplex.dao.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nju.cineplex.dao.ServerDao;
import edu.nju.cineplex.model.Server;


@Repository
public class ServerDaoImpl extends BaseDaoImpl<Server> implements ServerDao {

	public boolean checkLogin(String email, String pw) {
		String query = "from Server where email=? and password=?";
		List<Server> server_list = findByHQL(query, email, pw);
		
		if(server_list.isEmpty())
			return false;
		
		return true;
	}

}
