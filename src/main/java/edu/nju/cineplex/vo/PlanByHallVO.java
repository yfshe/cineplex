package edu.nju.cineplex.vo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.nju.cineplex.model.Plan;

public class PlanByHallVO {
	private int hall_no;
	private List<Integer> film_id_list;
	private List<String> film_name_list;
	private List<String> session_list;
	
	public PlanByHallVO(){
		film_id_list = new ArrayList<Integer>();
		film_name_list = new ArrayList<String>();
		session_list = new ArrayList<String>();
	}

	public int getHall_no() {
		return hall_no;
	}
	public void setHall_no(int hall_no) {
		this.hall_no = hall_no;
	}
	public List<Integer> getFilm_id_list() {
		return film_id_list;
	}
	public List<String> getSession_list() {
		return session_list;
	}
	public List<String> getFilm_name_list() {
		return film_name_list;
	}
	public void setList(List<Plan> plan_list){
		Iterator<Plan> iterator = plan_list.iterator();
		while(iterator.hasNext()){
			Plan plan = iterator.next();
			film_id_list.add(plan.getFilm_id());
			film_name_list.add(plan.getFilm_name());
			
			String start = plan.getStart_time().toString();
			start = start.substring(0, start.lastIndexOf(':'));
			String end = plan.getEnd_time().toString();
			end = end.substring(0, end.lastIndexOf(':'));
			
			session_list.add(start + "-" + end);
		}
	}

	public void setFilm_id_list(List<Integer> film_id_list) {
		this.film_id_list = film_id_list;
	}

	public void setFilm_name_list(List<String> film_name_list) {
		this.film_name_list = film_name_list;
	}

	public void setSession_list(List<String> session_list) {
		this.session_list = session_list;
	}

}
