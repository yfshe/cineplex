package dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.nju.cineplex.dao.*;
import edu.nju.cineplex.dao.impl.*;
import edu.nju.cineplex.model.Message;

public class MessageDaoTest {

	public static void main(String[] args) {
		/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		MessageDao md = applicationContext.getBean(MessageDaoImpl.class);
		
		List<Message> mlist = md.getMessageList();
		
		for(int i = 0; i < mlist.size(); i++){
			System.out.println(mlist.get(i).getContent());
		}*/
		
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("hello");
		System.out.println(StringUtils.join(list.toArray(),";"));
	}

}
