package edu.nju.cineplex.service.message;

import java.util.List;

import edu.nju.cineplex.vo.*;

public interface MessageService {
	
	public List<MessageVO> getMessageList(QuantityRangeVO range);
	public MessageVO getMessage(int id);
	public boolean addNewMessage(MessageVO message);
	

}
