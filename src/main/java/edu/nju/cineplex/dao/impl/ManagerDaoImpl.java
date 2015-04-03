package edu.nju.cineplex.dao.impl;


import java.util.List;


import org.springframework.stereotype.Repository;

import edu.nju.cineplex.dao.ManagerDao;
import edu.nju.cineplex.model.Manager;

@Repository
public class ManagerDaoImpl extends BaseDaoImpl<Manager> implements ManagerDao {

	public boolean checkLogin(String email, String pw) {
		String query = "from Manager where email=? and password=?";
		List<Manager> manager_list = findByHQL(query, email, pw);
		
		if(manager_list.isEmpty())
			return false;
		
		return true;
	}

}
