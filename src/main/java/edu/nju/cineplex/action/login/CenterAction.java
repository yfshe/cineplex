package edu.nju.cineplex.action.login;

import edu.nju.cineplex.action.BaseAction;

public class CenterAction extends BaseAction{
	
	public String execute(){
		String type = (String) getSession(true).getAttribute("login");
		
		if(type.equals("member"))
			return "member";
		if(type.equals("server"))
			return "server";
		if(type.equals("manager"))
			return "manager";
		
		return "error";
	}

}
