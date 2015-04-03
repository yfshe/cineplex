package edu.nju.cineplex.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nju.cineplex.dao.MessageDao;
import edu.nju.cineplex.model.Message;

@Repository
public class MessageDaoImpl extends BaseDaoImpl<Message> implements MessageDao{

	public List<Message> getMessageList() {
		String query = "from Message";
		
		List<Message> mlist = findByHQL(query);
		
		return mlist;
	}

	
}
