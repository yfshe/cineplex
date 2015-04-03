package edu.nju.cineplex.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CostRecord")
public class CostRecord {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int member_id;
	private Timestamp cost_date;
	private String description;
	private int cost;
	private int balance;
	
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
	public Timestamp getCost_date() {
		return cost_date;
	}
	public void setCost_date(Timestamp cost_date) {
		this.cost_date = cost_date;
	}

}
