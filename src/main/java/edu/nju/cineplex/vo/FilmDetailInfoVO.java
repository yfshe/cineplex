package edu.nju.cineplex.vo;

import edu.nju.cineplex.model.Film;

public class FilmDetailInfoVO extends FilmBriefInfoVO{
	private String director;
	private String writer;
	private String actor;
	private String film_type;
	private String site;
	private String country;
	private String language;
	private String length;
	private String plot;
	
	public FilmDetailInfoVO(Film film){
		super(film);
		
		this.actor = film.getActor();
		this.country = film.getCountry();
		this.director = film.getDirector();
		this.film_type = film.getFilm_type();
		this.language = film.getLanguage();
		this.length = film.getLength();
		this.plot = film.getPlot();
		this.site = film.getSite();
		this.writer = film.getWriter();
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getFilm_type() {
		return film_type;
	}

	public void setFilm_type(String film_type) {
		this.film_type = film_type;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}


}
