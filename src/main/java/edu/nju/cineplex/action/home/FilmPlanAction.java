package edu.nju.cineplex.action.home;

import java.sql.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;

import edu.nju.cineplex.action.BaseAction;
import edu.nju.cineplex.service.film.FilmService;
import edu.nju.cineplex.service.film.impl.FilmServiceImpl;
import edu.nju.cineplex.vo.PlanByFilmVO;
import edu.nju.cineplex.vo.PlanVO;

public class FilmPlanAction extends BaseAction{
	@Resource(type=FilmServiceImpl.class)
	private FilmService filmService;
	
	private Date date;
	
	private String result;

    public String execute(){
    	
    	return SUCCESS;
    }
    public String planFilmQuery(){
    	
    	System.out.println("planFilmQuery");
    	
    	System.out.println(date.toString());
    	
    	PlanVO plan = filmService.getPlanByFilmList(date);
    	List<PlanByFilmVO> film_plan_list = plan.getPlanByFilmList();
    	
    	Map<String, String> plan_map = new HashMap<String, String>();
    	
    	Iterator<PlanByFilmVO> iterator = film_plan_list.iterator();
    	while(iterator.hasNext()){
    		PlanByFilmVO planVO = iterator.next();
    		String session = StringUtils.join(planVO.getSession_list().toArray(), ";");
    		plan_map.put("film"+planVO.getFilm_id(), session); 
    	}
    	
    	JSONObject json = JSONObject.fromObject(plan_map);
    	
    	result = json.toString();
    	
		
		return SUCCESS;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
    

}
