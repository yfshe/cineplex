package edu.nju.cineplex.vo;

import java.util.Date;

public class TicketVO {
	private int member_id;
	private int film_id;
	private String film_name;
	private String film_session;
	private Date view_date;
	private int seat_no;
	private int price;

	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
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
	public String getFilm_session() {
		return film_session;
	}
	public void setFilm_session(String film_session) {
		this.film_session = film_session;
	}
	public Date getView_date() {
		return view_date;
	}
	public void setView_date(Date view_date) {
		this.view_date = view_date;
	}
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
