package service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.service.member.impl.MemberServiceImpl;
import edu.nju.cineplex.vo.*;

public class MemberServiceTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		MemberServiceImpl m = applicationContext.getBean(MemberServiceImpl.class);
		
		/*test member_login
		LoginVO login = new LoginVO();
		login.setEmail("yfshe.326@gmail.com");
		login.setPassword("password");
		System.out.println(m.member_login(login));
		login.setEmail("yfshe@gmail.com");
		System.out.println(m.member_login(login));
		login.setEmail("yfshe.326@gmail.com");
		login.setPassword("passord");
		System.out.println(m.member_login(login));
		*/

		/* server_login manager_login
		LoginVO login = new LoginVO();
		login.setEmail("server@cineplex.com");
		login.setPassword("password");
		System.out.println(m.server_login(login));
		login = new LoginVO();
		login.setEmail("manager@cineplex.com");
		login.setPassword("password");
		System.out.println(m.manager_login(login));
		*/
		
		/* member_register
		RegisterVO register = new RegisterVO();
		register.setEmail("yfshe.326@gmail.com");
		register.setName("name");
		register.setPassword("pass");
		System.out.println(m.member_register(register));
		register = new RegisterVO();
		register.setEmail("s.yunfeng@gmail.com");
		register.setName("丰田汽车");
		register.setPassword("password");
		System.out.println(m.member_register(register).getId());
		*/
		
		/* getMemberBriefInfo
		System.out.println(m.getMemberBriefInfo(100));
		MemberBriefInfoVO mv = m.getMemberBriefInfo(1000002);
		System.out.println(mv.getId());
		System.out.println(mv.getLevel());
		System.out.println(mv.getName());
		System.out.println(mv.getBalance());
		System.out.println(mv.getPoints());
		*/
		
		/* getMemberDetailInfo
		System.out.println(m.getMemberDetailInfo(100));
		MemberDetailInfoVO mdv = m.getMemberDetailInfo(1000002);
		System.out.println(mdv.getGender());
		System.out.println(mdv.getIntersts());
		System.out.println(mdv.getLocation());
		System.out.println(mdv.getState());
		System.out.println(mdv.getBirthday());
		System.out.println(mdv.getValid_date());
		*/
		
		/* setMemberDetailInfo
		MemberDetailInfoVO mdv = new MemberDetailInfoVO();
		mdv.setId(1000002);
		mdv.setBankcard("987654321");
		mdv.setBirthday(Date.valueOf("1999-3-26"));
		mdv.setGender("m");
		m.setMemberDetailInfo(mdv);
		*/
		
		/* member_recharge
		RechargeVO rv = new RechargeVO();
		rv.setId(1000002);
		rv.setType("bankcard");
		rv.setMoney(1000);
		m.member_recharge(rv);
		rv = new RechargeVO();
		rv.setId(1000002);
		rv.setType("point");
		rv.setMoney(60);
		m.member_recharge(rv);
		*/

		/* getMemberCostRecords*/
		TimeRangeVO tv = new TimeRangeVO();
		tv.setStart(Timestamp.valueOf("2015-3-1 0:0:0"));
		tv.setEnd(Timestamp.valueOf("2015-3-8 23:59:59"));
		Iterator<CostRecordVO> i = m.getMemberCostRecords(1000002, tv).iterator();
		while(i.hasNext()){
			System.out.println(i.next().getDescription());
		}
		
		/* member_upgrade
		UpgradeVO uv = new UpgradeVO();
		uv.setId(1000002);
		uv.setLevel(3);
		m.member_upgrade(uv);
		*/
		
		/*getMemberActivities
		Iterator<FilmBriefInfoVO> i = m.getMemberActivities(1000002).iterator();
		while(i.hasNext()){
			System.out.println(i.next().getName());
		}
		*/
		
		/* member_delete
		m.member_delete(1000003);
		*/

		

		
	}

}

















