package edu.nju.cineplex.action.server;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import edu.nju.cineplex.action.BaseAction;
import edu.nju.cineplex.service.film.FilmService;
import edu.nju.cineplex.service.film.impl.FilmServiceImpl;
import edu.nju.cineplex.vo.PlanByHallVO;
import edu.nju.cineplex.vo.PlanVO;

public class PlanAction extends BaseAction{
	@Resource(type=FilmServiceImpl.class)
	private FilmService filmService;
	
	private String film;
	private String session;
	private Date date;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String addPlan(){
		Map<String,Integer>film_map = new HashMap<String, Integer>();
		film_map.put("蝙蝠侠：黑暗骑士崛起", 1);
		film_map.put("辩护人", 2);
		film_map.put("超体", 3);
		film_map.put("盗梦空间",4);
		
		PlanVO plan = new PlanVO();
		plan.setDate(date);
		
		String film_list[] = film.split(";");
		String session_list[] = session.split(";");
		
		for(int i = 0; i < film_list.length; i++){
			if(film_list[i] != ""){
				String s_list[] = session_list[i].split(",");
				String f_list[] = film_list[i].split(",");
				
				List<String> name_list = new ArrayList<String>();
				List<String> sess_list = new ArrayList<String>();
				List<Integer> id_list = new ArrayList<Integer>();
				
				for(int j = 0; j < s_list.length; j++){
					if(s_list[j] != ""){
						name_list.add(f_list[j]);
						sess_list.add(s_list[j]);
						id_list.add(film_map.get(f_list[j]));
					}
				}
				
				PlanByHallVO fbhvo = new PlanByHallVO();
				fbhvo.setFilm_id_list(id_list);
				fbhvo.setFilm_name_list(name_list);
				fbhvo.setSession_list(sess_list);
				fbhvo.setHall_no(i+1);
				
				System.out.println(id_list);
				
				plan.addPlanByHallVO(fbhvo);
			}
		}
		
		filmService.addNewFilmPlan(plan);
		
		return SUCCESS;
	}

    public String execute(){
		
		return SUCCESS;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getFilm() {
		return film;
	}

	public void setFilm(String film) {
		this.film = film;
	}

}
