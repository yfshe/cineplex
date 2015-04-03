package edu.nju.cineplex.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.nju.cineplex.dao.CostRecordDao;
import edu.nju.cineplex.model.CostRecord;

@Repository
public class CostRecordDaoImpl extends BaseDaoImpl<CostRecord> implements CostRecordDao{

	public List<CostRecord> getCostRecordList(int id, Timestamp start,
			Timestamp end) {
		
		String query = "select cr from CostRecord cr, Member m where cr.member_id = "
				+ "m.id and m.id = ? and cr.cost_date >= ? and cr.cost_date <= ?";
		
		List<CostRecord> crlist = findByHQL(query, id, start, end);
		
		return crlist;
	}


}
