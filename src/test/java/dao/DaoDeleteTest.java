package dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.dao.MemberDao;
import edu.nju.cineplex.dao.impl.MemberDaoImpl;
import edu.nju.cineplex.model.Member;

public class DaoDeleteTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		MemberDao md = applicationContext.getBean(MemberDaoImpl.class);
		md.delete(1000004);

	}

}
