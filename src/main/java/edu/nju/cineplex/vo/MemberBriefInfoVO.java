package edu.nju.cineplex.vo;

import edu.nju.cineplex.model.Member;

public class MemberBriefInfoVO {
	private int id;
	private String name;
	private int level;
	private int balance;
	private int points;
	
	public MemberBriefInfoVO(){
	}
	
	public MemberBriefInfoVO(Member member){
		this.id = member.getId();
		this.name = member.getName();
		this.level = member.getM_level();
		this.balance = member.getBalance();
		this.points = member.getPoints();
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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
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
}
