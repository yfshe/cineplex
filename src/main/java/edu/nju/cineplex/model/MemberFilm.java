package edu.nju.cineplex.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MemberFilm")
public class MemberFilm {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int member_id;
	private int film_id;
	private String film_name;
	private String film_session;
	private Date view_date;
	private int seat_no;
	private String activity;
	private int price;

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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
