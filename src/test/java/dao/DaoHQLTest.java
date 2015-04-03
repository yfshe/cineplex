package dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.dao.*;
import edu.nju.cineplex.dao.impl.*;
import edu.nju.cineplex.model.*;

public class DaoHQLTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		MemberDao md = applicationContext.getBean(MemberDaoImpl.class);
		List<Member> ml = md.findByHQL("from Member where name = ?", "佘昀峰");
		System.out.println(ml.get(0).getEmail());

		CostRecordDao crd = applicationContext.getBean(CostRecordDaoImpl.class);
		List<CostRecord> crl = crd.findByHQL("select cr from Member m,CostRecord cr where m.id = cr.member_id and m.id = ?", 1000002);
		for(int i = 0; i < crl.size(); i++){
			System.out.println(crl.get(i).getDescription());
		}
	}

}
