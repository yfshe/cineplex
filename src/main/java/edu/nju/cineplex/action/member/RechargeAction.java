package edu.nju.cineplex.action.member;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import edu.nju.cineplex.action.BaseAction;
import edu.nju.cineplex.service.member.MemberService;
import edu.nju.cineplex.service.member.impl.MemberServiceImpl;
import edu.nju.cineplex.vo.MemberDetailInfoVO;
import edu.nju.cineplex.vo.RechargeVO;

public class RechargeAction extends BaseAction{
	@Resource(type=MemberServiceImpl.class)
	private MemberService memberService;
	
	private int money;
	private String type;

	public String recharge(){
		RechargeVO recharge = new RechargeVO();
		recharge.setId((Integer) getSession(true).getAttribute("id"));
		recharge.setMoney(money);
		recharge.setType(type);
		
		System.out.println(recharge.getId());
		System.out.println(recharge.getMoney());
		System.out.println(recharge.getType());
		
		memberService.member_recharge(recharge);
		
		return SUCCESS;
	}
    public String execute(){
    	int id = (Integer) getSession(true).getAttribute("id");
    	MemberDetailInfoVO member = memberService.getMemberDetailInfo(id);
    	
    	getSession(true).setAttribute("member", member);
		
    	return SUCCESS;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
