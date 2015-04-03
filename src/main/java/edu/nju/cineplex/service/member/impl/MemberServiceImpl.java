package edu.nju.cineplex.service.member.impl;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import edu.nju.cineplex.dao.*;
import edu.nju.cineplex.dao.impl.ActivityDaoImpl;
import edu.nju.cineplex.dao.impl.CostRecordDaoImpl;
import edu.nju.cineplex.dao.impl.FilmDaoImpl;
import edu.nju.cineplex.dao.impl.ManagerDaoImpl;
import edu.nju.cineplex.dao.impl.MemberDaoImpl;
import edu.nju.cineplex.dao.impl.ServerDaoImpl;
import edu.nju.cineplex.model.*;
import edu.nju.cineplex.service.member.MemberService;
import edu.nju.cineplex.vo.*;

@Repository
public class MemberServiceImpl implements MemberService {

	@Resource(type=MemberDaoImpl.class)
	private MemberDao memberDao;

	@Resource(type=ServerDaoImpl.class)
	private ServerDao serverDao;

	@Resource(type=ManagerDaoImpl.class)
	private ManagerDao managerDao;
	
	@Resource(type=CostRecordDaoImpl.class)
	private CostRecordDao costRecordDao;
	
	@Resource(type=FilmDaoImpl.class)
	private FilmDao filmDao;
	
	public int member_login(LoginVO login) {
		return memberDao.checkLogin(login.getEmail(), login.getPassword());
	}
	
	public boolean server_login(LoginVO login) {
		return serverDao.checkLogin(login.getEmail(), login.getPassword());
	}
	
	public boolean manager_login(LoginVO login) {
		return managerDao.checkLogin(login.getEmail(), login.getPassword());
	}

	public MemberBriefInfoVO member_register(RegisterVO register) {
		if(! memberDao.checkWithEmail(register.getEmail())){
			return null;
		}
		
		Member member = new Member();
		member.setEmail(register.getEmail());
		member.setName(register.getName());
		member.setPasswrod(register.getPassword());
		member.setState("未激活");
		
		memberDao.save(member);
		
		MemberBriefInfoVO mbivo = new MemberBriefInfoVO(member);
		
		return mbivo;
	}

	public MemberBriefInfoVO getMemberBriefInfo(int id) {
		Member member = memberDao.findById(id);
		
		if(null == member)
			return null;
		
		MemberBriefInfoVO mbivo = new MemberBriefInfoVO(member);
		
		return mbivo;
	}

	public MemberDetailInfoVO getMemberDetailInfo(int id) {
		Member member = memberDao.findById(id);
		
		if(null == member)
			return null;
		
		MemberDetailInfoVO mdivo = new MemberDetailInfoVO(member);
		
		return mdivo;
	}

	public boolean setMemberDetailInfo(MemberDetailInfoVO info) {
		Member member = memberDao.findById(info.getId());
		
		if(null == member)
			return false;
		
		member.setBankcard(info.getBankcard());
		member.setBirthday(info.getBirthday());
		member.setGender(info.getGender());
		member.setIntersts(info.getIntersts());
		member.setLocation(info.getLocation());
		
		memberDao.update(member);
		
		return true;
	}

	public boolean member_recharge(RechargeVO recharge) {
		String type = recharge.getType();
		
		Member member;
		
		if(type.equals("bankcard")){
			member = memberDao.findById(recharge.getId());
			
			if(null == member)
				return false;
			
			int balance = member.getBalance() + recharge.getMoney();
			
			member.setBalance(balance);
			memberDao.update(member);
			
			recordCost("银行卡充值", recharge.getMoney(), member);

		}else{
			member = memberDao.findById(recharge.getId());
			int points = member.getPoints();
			int balance = member.getBalance();
			int level = member.getM_level();
			
			if(null == member || points < recharge.getMoney())
				return false;
			
			int money = 0;
			switch(level){
			case 1:
				money = recharge.getMoney() / 10;
				break;
			case 2:
				money = recharge.getMoney() / 8;
				break;
			case 3:
				money = recharge.getMoney() / 6;
				break;
			}
			member.setBalance(balance + money);
			member.setPoints(points - recharge.getMoney());
			memberDao.update(member);

			recordCost("积分兑换金额", money, member);
		}
        
		return true;
			
	}

	public List<CostRecordVO> getMemberCostRecords(int id, TimeRangeVO range) {
		List<CostRecord> rlist = costRecordDao.getCostRecordList(id, range.getStart(), range.getEnd());
		
		ArrayList<CostRecordVO> rvolist = new ArrayList<CostRecordVO>();
		
		Iterator<CostRecord> iterator = rlist.iterator();
		
		while(iterator.hasNext()){
			rvolist.add(new CostRecordVO(iterator.next()));
		}
		
		Comparator<CostRecordVO> comparator = new Comparator<CostRecordVO>(){

			public int compare(CostRecordVO r1, CostRecordVO r2) {
				if(r1.getTime().after(r2.getTime()))
					return -1;
				else
					return 1;
			}
		};
		
		Collections.sort(rvolist, comparator);
		
		return rvolist;
	}

	public boolean member_upgrade(UpgradeVO upgrade) {
		Member member = memberDao.findById(upgrade.getId());
		int level = upgrade.getLevel();
		int balance = member.getBalance();
		
		if(member.getM_level() > level)
			return false;
		
		switch(level){
		case 1:
			if(balance < 400)
				return false;
			member.setBalance(balance - 400);
			member.setM_level(level);
			break;
		case 2:
			if(balance < 600)
				return false;
			member.setBalance(balance - 600);
			member.setM_level(level);
			break;
		case 3:
			if(balance < 800)
				return false;
			member.setBalance(balance - 800);
			member.setM_level(level);
			break;
		}
		
		Date date = new Date(new java.util.Date().getTime());
		int year = date.getYear();
		date.setYear(year + 1);
		member.setValid_date(date);
		member.setState("正常");
		
        memberDao.update(member);
        
        return true;
		
	}

	public List<FilmBriefInfoVO> getMemberActivities(int id) {
		List<Film> flist = filmDao.getFilmNoJoinAc(id);
		
		ArrayList<FilmBriefInfoVO> fbilist = new ArrayList<FilmBriefInfoVO>();
		
		Iterator<Film> iterator = flist.iterator();
		
		while(iterator.hasNext()){
			fbilist.add(new FilmBriefInfoVO(iterator.next()));
		}
		
		return fbilist;
	}

	public void member_delete(int id) {
		memberDao.delete(id);
	}

	private void recordCost(String description, int cost, Member member){
		CostRecord cr = new CostRecord();
		cr.setBalance(member.getBalance());
		cr.setCost(cost);
		cr.setCost_date(new Timestamp(new java.util.Date().getTime()));
		cr.setDescription(description);
		cr.setMember_id(member.getId());
		
		costRecordDao.save(cr);
	}
}
