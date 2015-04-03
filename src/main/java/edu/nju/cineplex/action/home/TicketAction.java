package edu.nju.cineplex.action.home;

import java.sql.Date;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import edu.nju.cineplex.action.BaseAction;
import edu.nju.cineplex.service.film.FilmService;
import edu.nju.cineplex.service.film.impl.FilmServiceImpl;
import edu.nju.cineplex.vo.TicketVO;

public class TicketAction extends BaseAction{
	@Resource(type=FilmServiceImpl.class)
	private FilmService filmService;
	private String filmId;
	private String filmName;
	private String date;
	private String session;
	private String seatNo;
	private String price;

    public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String execute(){
		
		return "success";
	}
    
    public String purchaseTicket(){
    	TicketVO ticket = new TicketVO();
    	ticket.setFilm_id(Integer.parseInt(filmId));
    	ticket.setFilm_name(filmName);
    	ticket.setFilm_session(session);
    	ticket.setMember_id((Integer) getSession(true).getAttribute("id"));
    	ticket.setPrice(Integer.parseInt(price));
    	ticket.setSeat_no(Integer.parseInt(seatNo));
    	ticket.setView_date(Date.valueOf(date));
    	
    	filmService.film_buyTicket(ticket);
    	
    	return SUCCESS;
    }

	public String getFilmId() {
		return filmId;
	}

	public void setFilmId(String filmId) {
		this.filmId = filmId;
	}

}
