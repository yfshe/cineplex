package edu.nju.cineplex.action.login;

import javax.servlet.http.HttpSession;

import edu.nju.cineplex.action.BaseAction;

public class LogoutAction extends BaseAction{

	public String logout(){
		HttpSession session = getSession(true);
		session.removeAttribute("id");
		session.removeAttribute("login");
		
		return SUCCESS;
	}

}
