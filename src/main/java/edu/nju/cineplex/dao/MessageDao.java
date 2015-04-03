package edu.nju.cineplex.dao;

import java.util.List;

import edu.nju.cineplex.model.Message;

public interface MessageDao extends BaseDao<Message> {
	
	List<Message> getMessageList();

}
