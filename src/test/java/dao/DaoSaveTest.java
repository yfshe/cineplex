package dao;


import java.sql.Date;
import java.sql.Time;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.dao.*;
import edu.nju.cineplex.dao.impl.*;
import edu.nju.cineplex.model.*;

public class DaoSaveTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MemberDao md = applicationContext.getBean(MemberDaoImpl.class);
		Member m = new Member();
		m.setName("tachikoma");
		m.setEmail("s.yunfeng@hotmail.com");
		m.setPasswrod("password");
		md.save(m);
		
		
		MessageDao mesgd = applicationContext.getBean(MessageDaoImpl.class);
		Message mesg = new Message();
		mesg.setContent("你好吗？");
		mesg.setTitle("问候");
		mesg.setMesg_date(new Date(15,3,1));
		mesgd.save(mesg);
		
		
		CostRecordDao crd = applicationContext.getBean(CostRecordDaoImpl.class);
		CostRecord cr = new CostRecord();
		cr.setMember_id(1000002);
		cr.setBalance(10);
		cr.setCost(5);
		crd.save(cr);
		
		PlanDao pd = applicationContext.getBean(PlanDaoImpl.class);
		Plan p = new Plan();
		p.setEnd_time(new Time(9,9,9));
		p.setFilm_id(1);
		p.setPlan_date(new Date(15,3,1));
		pd.save(p);
		
		MemberFilmDao mfd = applicationContext.getBean(MemberFilmDaoImpl.class);
		MemberFilm mf = new MemberFilm();
		mf.setFilm_id(1);
		mf.setMember_id(1000002);
		mfd.save(mf);
		
		ActivityDao ad = applicationContext.getBean(ActivityDaoImpl.class);
		Activity a = new Activity();
		a.setFilm_id(1);
		a.setQuestion("活动");
		ad.save(a);
	}

}
