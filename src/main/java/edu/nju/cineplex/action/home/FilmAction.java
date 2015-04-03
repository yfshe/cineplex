package edu.nju.cineplex.action.home;


import javax.annotation.Resource;

import edu.nju.cineplex.action.BaseAction;
import edu.nju.cineplex.service.film.FilmService;
import edu.nju.cineplex.service.film.impl.FilmServiceImpl;
import edu.nju.cineplex.vo.ActivityVO;
import edu.nju.cineplex.vo.FilmDetailInfoVO;

public class FilmAction extends BaseAction{
	@Resource(type=FilmServiceImpl.class)
	FilmService filmService;

    public String execute(){
    	int id = Integer.parseInt(getRequest().getParameter("id"));
    	
    	FilmDetailInfoVO film = filmService.getFileDetailInfo(id);
    	ActivityVO activity = filmService.getFilmActivity(id);
    	
    	getSession(true).setAttribute("film", film);
    	getSession(true).setAttribute("activity", activity);
		
		return "success";
	}

}
