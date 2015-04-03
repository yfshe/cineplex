package edu.nju.cineplex.action.manager;

import java.sql.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

import edu.nju.cineplex.action.BaseAction;
import edu.nju.cineplex.service.film.FilmService;
import edu.nju.cineplex.service.film.impl.FilmServiceImpl;
import edu.nju.cineplex.vo.PlanByHallVO;
import edu.nju.cineplex.vo.PlanVO;

public class PlanAction extends BaseAction{
	@Resource(type=FilmServiceImpl.class)
	private FilmService filmService;
	
	private String date;
	private String result;
	
	public String passPlan(){
		Date plan_date = Date.valueOf(date);
		filmService.checkPassFilmPlan(plan_date);
		
		return SUCCESS;
	}
	
	public String checkPlan(){
		Date plan_date = Date.valueOf(date);
		PlanVO plan = filmService.getPlanByHallList(plan_date);
		List<PlanByHallVO> plan_list = plan.getPlanByHallList();
		Map<String, String> plan_map = new HashMap<String, String>();
		Iterator<PlanByHallVO> iterator = plan_list.iterator();
		while(iterator.hasNext()){
			PlanByHallVO pbhvo = iterator.next();
			plan_map.put("session_hall_"+pbhvo.getHall_no(), StringUtils.join(pbhvo.getSession_list().toArray(), "<br/>")); plan_map.put("film_hall_"+pbhvo.getHall_no(), StringUtils.join(pbhvo.getFilm_name_list().toArray(), "<br/>"));
		}
		
        JSONObject json = JSONObject.fromObject(plan_map);
        
        System.out.println(json.toString());
    	
    	setResult(json.toString());
		
		return SUCCESS;
	}

    public String execute(){
		
		return SUCCESS;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
