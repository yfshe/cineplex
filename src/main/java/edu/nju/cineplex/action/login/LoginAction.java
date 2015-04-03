package edu.nju.cineplex.action.login;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionSupport;

import edu.nju.cineplex.action.BaseAction;
import edu.nju.cineplex.service.member.MemberService;
import edu.nju.cineplex.service.member.impl.MemberServiceImpl;
import edu.nju.cineplex.vo.LoginVO;

public class LoginAction extends BaseAction{
	
	@Resource(type=MemberServiceImpl.class)
	private MemberService memberService;
	
	private LoginVO login = new LoginVO();

	public String login(){
		HttpSession session = getSession(true);
		
		
		int id = memberService.member_login(login);
		
		if(id > 0){
			session.setAttribute("id", id);
			session.setAttribute("login", "member");
			return SUCCESS;
		}
		else if(memberService.server_login(login)){
			session.setAttribute("login", "server");
			return SUCCESS;
		}
		else if(memberService.manager_login(login)){
			session.setAttribute("login", "manager");
			return SUCCESS;
		}
		
		return "failure";
	}

	public LoginVO getLogin() {
		return login;
	}

	public void setLogin(LoginVO login) {
		this.login = login;
	}

}
