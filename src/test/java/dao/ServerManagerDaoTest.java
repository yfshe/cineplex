package dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.dao.ManagerDao;
import edu.nju.cineplex.dao.MessageDao;
import edu.nju.cineplex.dao.ServerDao;
import edu.nju.cineplex.dao.impl.ManagerDaoImpl;
import edu.nju.cineplex.dao.impl.MessageDaoImpl;
import edu.nju.cineplex.dao.impl.ServerDaoImpl;
import edu.nju.cineplex.model.Manager;
import edu.nju.cineplex.model.Server;

public class ServerManagerDaoTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		ServerDao sd = applicationContext.getBean(ServerDaoImpl.class);
		
		System.out.println(sd.checkLogin("server@cineplex.com", "password"));

		ManagerDao md = applicationContext.getBean(ManagerDaoImpl.class);
		
		System.out.println(md.checkLogin("manager@cineplex.com", "password"));
	}

}
