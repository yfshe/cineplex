package dao;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.dao.impl.*;
import edu.nju.cineplex.dao.*;
import edu.nju.cineplex.model.CostRecord;

public class CostRecordDaoTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		CostRecordDao crd = applicationContext.getBean(CostRecordDaoImpl.class);
		
		Timestamp start = Timestamp.valueOf("2015-3-1 0:0:0");
		Timestamp end = Timestamp.valueOf("2015-3-9 0:0:0");
		
		List<CostRecord> crlist = crd.getCostRecordList(1000002, start, end);
		
		System.out.println(crlist.size());

	}

}
