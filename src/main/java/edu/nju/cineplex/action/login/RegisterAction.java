package edu.nju.cineplex.action.login;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import edu.nju.cineplex.action.BaseAction;
import edu.nju.cineplex.service.member.MemberService;
import edu.nju.cineplex.service.member.impl.MemberServiceImpl;
import edu.nju.cineplex.vo.MemberBriefInfoVO;
import edu.nju.cineplex.vo.RegisterVO;

public class RegisterAction extends BaseAction{
	
	@Resource(type=MemberServiceImpl.class)
	private MemberService memberService;
	
	RegisterVO register = new RegisterVO();

    public RegisterVO getRegister() {
		return register;
	}

	public void setRegister(RegisterVO register) {
		this.register = register;
	}

	public String register(){
		MemberBriefInfoVO member = memberService.member_register(register);
		
		if(null == member)
			return "failure";
		
		HttpSession session = getSession(true);
		session.setAttribute("id", member.getId());
		session.setAttribute("login", "member");
		
		return "member";
		
		
	}

}
