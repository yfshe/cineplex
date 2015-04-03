package edu.nju.cineplex.utils;

import java.util.Date;  

import org.springframework.scheduling.annotation.Scheduled;  
import org.springframework.stereotype.Component;  

import edu.nju.cineplex.dao.ActivityDao;
import edu.nju.cineplex.dao.MemberDao;
import edu.nju.cineplex.dao.impl.ActivityDaoImpl;
import edu.nju.cineplex.dao.impl.MemberDaoImpl;
import edu.nju.cineplex.model.Member;
import edu.nju.cineplex.vo.RechargeVO;
  
@Component 
public class CheckTask {

	    /**
	     * 定时卡点计算。每天凌晨 02:00 执行一次
	     */
	    @Scheduled(cron = "0 0 2 * * *")
	    public void autoCardCalculate() {
	    	MemberDao memberDao = new MemberDaoImpl();
	    	Member member = new Member();
	    	String type="正常";
	    	RechargeVO recharge = new RechargeVO();
	    	
	    	if(type.equals("暂停")){
				member = memberDao.findById(recharge.getId());
				
				if(null == member)
					type = "暂停";
				
				int balance = member.getBalance() + recharge.getMoney();
				
				member.setBalance(balance);
				memberDao.update(member);
				

			}else{
				member = memberDao.findById(recharge.getId());
				int points = member.getPoints();
				int balance = member.getBalance();
				int level = member.getM_level();
				
				if(null == member || points < recharge.getMoney())
					type = "暂停";

			}
	    	
	    	ActivityDao activity = new ActivityDaoImpl();
	    	activity.findById(member.getBalance());
	    	int chance = (int) (Math.random() * 2);
	    	
	    	if(chance>1){
	    		member.setPoints(10);
	    	}
	    	
	    }

}
