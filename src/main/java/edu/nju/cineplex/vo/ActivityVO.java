package edu.nju.cineplex.vo;

import edu.nju.cineplex.model.Activity;

public class ActivityVO {
	private int film_id;
	private String film_name;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String answer;
	
	public ActivityVO(Activity a){
		this.film_id = a.getFilm_id();
		this.question = a.getQuestion();
		this.option1 = a.getOption1();
		this.option2 = a.getOption2();
		this.option3 = a.getOption3();
		this.answer = a.getAnswer();
	}
	public ActivityVO(){
		this.question = "本影片表达了怎样的一种世界观？";
		this.option1 = "积极的";
		this.option2 = "消极的";
		this.option3 = "无所谓的";
		this.answer = "积极的";
	}
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

}
