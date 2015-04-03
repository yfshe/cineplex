package dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.dao.*;
import edu.nju.cineplex.dao.impl.*;
import edu.nju.cineplex.model.*;

public class DaoUpdateTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		MemberDao md = applicationContext.getBean(MemberDaoImpl.class);
		Member m = md.findById(1000002);
		m.setBalance(99999);
		md.update(m);
		
		PlanDao pd = applicationContext.getBean(PlanDaoImpl.class);
		Plan p = pd.findById(1);
		p.setHall_no(5);
		pd.update(p);

	}

}
