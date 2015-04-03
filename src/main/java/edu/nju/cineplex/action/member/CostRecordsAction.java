package edu.nju.cineplex.action.member;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

import edu.nju.cineplex.action.BaseAction;
import edu.nju.cineplex.service.member.MemberService;
import edu.nju.cineplex.service.member.impl.MemberServiceImpl;
import edu.nju.cineplex.vo.CostRecordVO;
import edu.nju.cineplex.vo.TimeRangeVO;

public class CostRecordsAction extends BaseAction{
	@Resource(type=MemberServiceImpl.class)
	private MemberService memberService;
	
	private Date start;
	private Date end;
	
	private String result;
	
	public String getRecords(){
		int id = (Integer) getSession(true).getAttribute("id");
		TimeRangeVO range = new TimeRangeVO();
		String start_time = start.toString() + " 0:0:0";
		String end_time = end.toString() + " 23:59:59";

		range.setStart(Timestamp.valueOf(start_time));
		range.setEnd(Timestamp.valueOf(end_time));
		List<CostRecordVO> records = memberService.getMemberCostRecords(id, range);
		Iterator<CostRecordVO> iterator = records.iterator();
		String recordstring = "";
		while(iterator.hasNext()){
			CostRecordVO cr = iterator.next();
			recordstring += cr.getTime().toString() + "," + cr.getDescription()
					 + "," + cr.getCost() + "," + cr.getBalance() + ";";
		}
		
		
		Map<String, String> record_map = new HashMap<String, String>();
		record_map.put("records", recordstring);
		
        JSONObject json = JSONObject.fromObject(record_map);
    	
    	result = json.toString();
    	
    		
		return SUCCESS;
	}

    public String execute(){
		
    	return SUCCESS;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
