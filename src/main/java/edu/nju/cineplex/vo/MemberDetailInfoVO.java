package edu.nju.cineplex.vo;


import java.sql.Date;

import edu.nju.cineplex.model.Member;

public class MemberDetailInfoVO extends MemberBriefInfoVO{
	private String email;
	private int balance;
	private int points;
	private Date valid_date;
	private String state;
	private Date birthday;
	private String gender;
	private String location;
	private String bankcard;
	private String intersts;	
	
	public MemberDetailInfoVO(){
	}
	
	public MemberDetailInfoVO(Member member){
		super(member);
		
		this.email = member.getEmail();
		this.balance = member.getBalance();
		this.points = member.getPoints();
		this.valid_date = member.getValid_date();
		this.state = member.getState();
		this.birthday = member.getBirthday();
		this.gender = member.getGender();
		this.location = member.getLocation();
		this.bankcard = member.getBankcard();
		this.intersts = member.getIntersts();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Date getValid_date() {
		return valid_date;
	}

	public void setValid_date(Date valid_date) {
		this.valid_date = valid_date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBankcard() {
		return bankcard;
	}

	public void setBankcard(String bankcard) {
		this.bankcard = bankcard;
	}

	public String getIntersts() {
		return intersts;
	}

	public void setIntersts(String intersts) {
		this.intersts = intersts;
	}

}
