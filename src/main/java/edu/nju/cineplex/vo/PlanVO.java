package edu.nju.cineplex.vo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PlanVO {
	private Date date;
	private List<PlanByFilmVO> planByFilmList;
	private List<PlanByHallVO> planByHallList;
	
	public PlanVO(){
		planByFilmList = new ArrayList<PlanByFilmVO>();
		planByHallList = new ArrayList<PlanByHallVO>();
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public List<PlanByFilmVO> getPlanByFilmList() {
		return planByFilmList;
	}
	
	public void addPlanByFilmVO(PlanByFilmVO plan){
		planByFilmList.add(plan);
	}

	public List<PlanByHallVO> getPlanByHallList() {
		return planByHallList;
	}

	public void addPlanByHallVO(PlanByHallVO plan){
		planByHallList.add(plan);
	}

}