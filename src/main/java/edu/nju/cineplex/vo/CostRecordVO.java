package edu.nju.cineplex.vo;

import java.sql.Timestamp;

import edu.nju.cineplex.model.CostRecord;

public class CostRecordVO {
	private Timestamp time;
	private String description;
	private int cost;
	private int balance;
	
	public CostRecordVO(CostRecord cr){
		this.time = cr.getCost_date();
		this.description = cr.getDescription();
		this.cost = cr.getCost();
		this.balance = cr.getBalance();
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
