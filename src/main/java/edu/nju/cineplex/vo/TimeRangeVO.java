package edu.nju.cineplex.vo;

import java.sql.Timestamp;

public class TimeRangeVO {
	private Timestamp start;
	private Timestamp end;
	
	public Timestamp getStart() {
		return start;
	}
	public void setStart(Timestamp start) {
		this.start = start;
	}
	public Timestamp getEnd() {
		return end;
	}
	public void setEnd(Timestamp end) {
		this.end = end;
	}

}
