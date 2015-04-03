package edu.nju.cineplex.action.server;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import edu.nju.cineplex.action.BaseAction;
import edu.nju.cineplex.service.film.FilmService;
import edu.nju.cineplex.service.film.impl.FilmServiceImpl;
import edu.nju.cineplex.vo.ActivityVO;

public class ActivityAction extends BaseAction{
	@Resource(type=FilmServiceImpl.class)
	private FilmService filmService;
	
	private String film_id;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	public String getFilm_id() {
		return film_id;
	}

	public void setFilm_id(String film_id) {
		this.film_id = film_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	private String answer;
	
	public String addActivity(){
		int id = Integer.parseInt(film_id);
		ActivityVO activity = new ActivityVO();
		activity.setAnswer(answer);
		activity.setFilm_id(id);
		activity.setOption1(option1);
		activity.setOption2(option2);
		activity.setOption3(option3);
		activity.setQuestion(question);
		
		filmService.addFilmActivity(activity);
		
		return SUCCESS;
	}

    public String execute(){
		
		return SUCCESS;
	}

}
