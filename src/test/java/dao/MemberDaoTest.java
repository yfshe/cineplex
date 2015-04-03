package dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.dao.MemberDao;
import edu.nju.cineplex.dao.impl.MemberDaoImpl;
import edu.nju.cineplex.model.Member;
import junit.framework.TestCase;

public class MemberDaoTest extends TestCase {
	MemberDao md;
	
	public MemberDaoTest(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		md = applicationContext.getBean(MemberDaoImpl.class);
	}
	
	public void testFindByLogin(){
		assertEquals(true, md.checkLogin("yfshe.326@gmail.com", "password"));;
	}
	
	public void testCheckWithEmail(){
		assertEquals(true, md.checkWithEmail("yfshee.326@gmail.com"));
	}

}
