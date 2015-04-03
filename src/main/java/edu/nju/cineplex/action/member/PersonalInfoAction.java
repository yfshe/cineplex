package edu.nju.cineplex.action.member;

import java.sql.Date;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import edu.nju.cineplex.action.BaseAction;
import edu.nju.cineplex.service.member.MemberService;
import edu.nju.cineplex.service.member.impl.MemberServiceImpl;
import edu.nju.cineplex.vo.MemberDetailInfoVO;

public class PersonalInfoAction extends BaseAction{
	@Resource(type=MemberServiceImpl.class)
	private MemberService memberService;
	
	private Date birthday;
	private String location;
	private String bankcard;
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBankcard() {
		return bankcard;
	}

	public void setBankcard(String bankcard) {
		this.bankcard = bankcard;
	}

	public String save(){
		MemberDetailInfoVO member = memberService.getMemberDetailInfo((Integer) getSession(true).getAttribute("id"));

		member.setBankcard(bankcard);
		member.setLocation(location);
		
		memberService.setMemberDetailInfo(member);
		
		return SUCCESS;
	}

    public String execute(){
		
		return SUCCESS;
	}

}
