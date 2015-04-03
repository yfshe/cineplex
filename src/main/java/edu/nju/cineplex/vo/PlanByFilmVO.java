package edu.nju.cineplex.vo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.nju.cineplex.model.Plan;

public class PlanByFilmVO {
	private int film_id;
	private String film_name;
	private List<String> session_list;
	
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	public String getFilm_name() {
		return film_name;
	}
	public void setFilm_name(String film_name) {
		this.film_name = film_name;
	}
	public List<String> getSession_list() {
		return session_list;
	}
	public void setSession_list(List<Plan> plan_list) {
		session_list = new ArrayList<String>();
		
		Iterator<Plan> iterator = plan_list.iterator();
		while(iterator.hasNext()){
			Plan plan = iterator.next();
			String start = plan.getStart_time().toString();
			start = start.substring(0, start.lastIndexOf(':'));
			String end = plan.getEnd_time().toString();
			end = end.substring(0, end.lastIndexOf(':'));
			
			session_list.add(start + "-" + end);
		}
	}

}
