package dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.dao.*;
import edu.nju.cineplex.dao.impl.*;
import edu.nju.cineplex.model.*;

public class PlanDaoTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		PlanDao pd = applicationContext.getBean(PlanDaoImpl.class);
		
	}

}
