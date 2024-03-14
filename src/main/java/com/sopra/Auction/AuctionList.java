package com.sopra.Auction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AuctionList {
	@Id
	@Column(name="Auction_ID")
	int auc_id;
	
	
	String player_name;
	
	@Column(name="Base_price")
	double b_pr;
	
	@Column(name="Final_price")
	double f_pr;
	
	String team;

	public int getAuc_id() {
		return auc_id;
	}

	public void setAuc_id(int auc_id) {
		this.auc_id = auc_id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public double getB_pr() {
		return b_pr;
	}

	public void setB_pr(double b_pr) {
		this.b_pr = b_pr;
	}

	public double getF_pr() {
		return f_pr;
	}

	public void setF_pr(double f_pr) {
		this.f_pr = f_pr;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public AuctionList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public AuctionList(int auc_id, String player_name, double b_pr, double f_pr, String team) {
		super();
		this.auc_id = auc_id;
		this.player_name = player_name;
		this.b_pr = b_pr;
		this.f_pr = f_pr;
		this.team = team;
	}

	@Override
	public String toString() {
		return "AuctionList [auc_id=" + auc_id + ", player_name=" + player_name + ", b_pr=" + b_pr + ", f_pr=" + f_pr
				+ ", team=" + team + "]";
	}
	
	
	
	
	
	
	

}
