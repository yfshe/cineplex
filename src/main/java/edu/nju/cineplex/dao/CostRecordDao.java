package edu.nju.cineplex.dao;

import java.sql.Timestamp;
import java.util.List;

import edu.nju.cineplex.model.CostRecord;

public interface CostRecordDao extends BaseDao<CostRecord> {
	
	public List<CostRecord> getCostRecordList(int id, Timestamp start, Timestamp end);

}
