package edu.nju.cineplex.dao;

import edu.nju.cineplex.model.Member;

public interface MemberDao extends BaseDao<Member> {

	public int checkLogin(String email, String pw);
	public boolean checkWithEmail(String email);
	
}
