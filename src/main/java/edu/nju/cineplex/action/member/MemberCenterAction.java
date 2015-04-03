package edu.nju.cineplex.action.member;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import edu.nju.cineplex.action.BaseAction;
import edu.nju.cineplex.service.member.MemberService;
import edu.nju.cineplex.service.member.impl.MemberServiceImpl;
import edu.nju.cineplex.vo.MemberDetailInfoVO;

public class MemberCenterAction extends BaseAction{
	@Resource(type=MemberServiceImpl.class)
	MemberService memberService;

    public String execute(){
    	int id = (Integer) getSession(true).getAttribute("id");
    	
    	MemberDetailInfoVO member = memberService.getMemberDetailInfo(id);
    	
    	getSession(true).setAttribute("member", member);
		
		return SUCCESS;
	}

}
