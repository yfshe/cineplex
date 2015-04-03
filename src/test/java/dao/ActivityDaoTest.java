package dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.dao.*;
import edu.nju.cineplex.dao.impl.*;
import edu.nju.cineplex.model.Activity;

public class ActivityDaoTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		ActivityDao acd = applicationContext.getBean(ActivityDaoImpl.class);
		
		List<Activity> aclist = acd.getActivityList(1);
		
		for(int i = 0; i < aclist.size(); i++){
			System.out.println(aclist.get(i).getQuestion());
		}

	}

}
