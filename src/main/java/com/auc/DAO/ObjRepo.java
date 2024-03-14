package com.auc.DAO;

import java.util.List;

import com.sopra.Auction.AuctionList;

public interface ObjRepo<T> {
	
	void save(AuctionList auc);
	
	AuctionList getById(int auc_id);
	
	List<AuctionList> getAll();
	
	String delete(int auc_id);
}
