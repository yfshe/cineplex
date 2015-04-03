package edu.nju.cineplex.vo;

import edu.nju.cineplex.model.Film;

public class FilmBriefInfoVO {
	private int id;
	private String name;
	
	public FilmBriefInfoVO(Film film){
		this.id = film.getId();
		this.name = film.getName();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
