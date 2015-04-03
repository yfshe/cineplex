package edu.nju.cineplex.action.member;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import edu.nju.cineplex.action.BaseAction;
import edu.nju.cineplex.service.member.MemberService;
import edu.nju.cineplex.service.member.impl.MemberServiceImpl;
import edu.nju.cineplex.vo.LevelVO;
import edu.nju.cineplex.vo.UpgradeVO;

public class UpgradeAction extends BaseAction{
	@Resource(type=MemberServiceImpl.class)
	private MemberService memberService;
	
	private int up_level;
	
	public String upgrade(){
    	int id = memberService.getMemberBriefInfo((Integer) getSession(true).getAttribute("id")).getId();
    	UpgradeVO uvo = new UpgradeVO();
    	
    	uvo.setId(id);
    	uvo.setLevel(up_level);
    	
    	System.out.println(up_level);

    	memberService.member_upgrade(uvo);
		
    	return SUCCESS;
	}

    public String execute(){
    	int level = memberService.getMemberBriefInfo((Integer) getSession(true).getAttribute("id")).getLevel();
    	LevelVO lvo = new LevelVO();
    	
    	switch(level){
    	case 0:
    		lvo.setLevel("非会员");
    		break;
    	case 1:
    		lvo.setLevel("白银会员");
    		break;
    	case 2:
    		lvo.setLevel("铂金会员");
    		break;
    	case 3:
    		lvo.setLevel("钻石会员");
    		break;
    	}
    	
    	getSession(true).setAttribute("level", lvo);
		
    	return SUCCESS;
	}

	public int getUp_level() {
		return up_level;
	}

	public void setUp_level(int up_level) {
		this.up_level = up_level;
	}

}
