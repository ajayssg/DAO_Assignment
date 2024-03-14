package com.auc.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.sopra.Auction.AuctionList;
import com.sopra.Auction.MyDriver;

@Repository
public class AucRepo implements ObjRepo<AuctionList> {

	@Override
	public void save(AuctionList auc) {

		
	}

	@Override
	public AuctionList getById(int auc_id) {
		Query<AuctionList> q = MyDriver.s.createQuery("FROM AuctionList where id =: x");
		q.setParameter("x", auc_id);
		
		List<AuctionList> lst = new ArrayList<AuctionList>();
		
		lst = q.list();
		
		if (lst.size() != 0) {
			return lst.getFirst();
		}
		return null;
	}

	@Override
	public List<AuctionList> getAll() {
		Query<AuctionList> q = MyDriver.s.createQuery("FROM AuctionList");
		
		List<AuctionList> lst = q.list();
		
		return lst;
	}


	@Override
	public String delete(int auc_id) {
		Query<AuctionList> q = MyDriver.s.createQuery("Delete from AuctionList where id =: x");
		
		q.setParameter("x", auc_id);
		
		int rows = q.executeUpdate();
		
		if (rows > 0) {
			return "Successfully deleted";
		}
		return "Unable to delete";
	}

	
	
	
	
}
