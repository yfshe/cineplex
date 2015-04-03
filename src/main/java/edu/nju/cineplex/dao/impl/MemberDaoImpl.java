package edu.nju.cineplex.dao.impl;


import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.nju.cineplex.dao.MemberDao;
import edu.nju.cineplex.model.Member;

@Repository
public class MemberDaoImpl extends BaseDaoImpl<Member> implements MemberDao {

	public int checkLogin(String email, String pw) {
		String query = "from Member where email=? and password=?";
		List<Member> member_list = findByHQL(query, email, pw);
		
		if(member_list.isEmpty())
			return -1;
		else
			return member_list.get(0).getId();
	}

	public boolean checkWithEmail(String email) {
		String query = "from Member where email=?";
		List<Member> member_list = findByHQL(query, email);
		
		if(member_list.isEmpty())
			return true;
		
		return false;
	}
	

}
