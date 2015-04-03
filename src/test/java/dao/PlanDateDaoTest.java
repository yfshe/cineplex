package dao;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.dao.ActivityDao;
import edu.nju.cineplex.dao.PlanDateDao;
import edu.nju.cineplex.dao.impl.ActivityDaoImpl;
import edu.nju.cineplex.dao.impl.PlanDateDaoImpl;
import edu.nju.cineplex.model.PlanDate;

public class PlanDateDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		PlanDateDao pdd = applicationContext.getBean(PlanDateDaoImpl.class);
		PlanDate planDate = new PlanDate();
		planDate.setPlan_date(new Date(new java.util.Date().getTime()));
		planDate.setState("n");
		pdd.save(planDate);
		
		planDate = pdd.findById(Date.valueOf("2015-4-25"));
		planDate.setState("n");
		pdd.update(planDate);

	}

}
