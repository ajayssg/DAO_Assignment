package com.sopra.Auction;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.auc.DAO.AucRepo;




/**
 * Hello world!
 *
 */
public class MyDriver 
{
	
	public static SessionFactory sf;
	public static Session s;
    public static void main( String[] args )
    {
    	Configuration config = new Configuration();
    	config.configure();
    	sf = config.buildSessionFactory();
    	AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext();
    	app.scan("com.auc.DAO");
    	app.refresh();

    	AucRepo auc = app.getBean(AucRepo.class);
    	s = sf.openSession();
    	Transaction t = s.beginTransaction();
    	
    	AuctionList p1=new AuctionList();
    	p1.setAuc_id(1);
    	p1.setPlayer_name("Yash Dayal");
    	p1.setB_pr(2000000);
    	p1.setF_pr(20000000);
    	p1.setTeam("RCB");
    	
    	
    	AuctionList p2=new AuctionList();
    	p2.setAuc_id(2);
    	p2.setPlayer_name("Swapnil Singh");
    	p2.setB_pr(2000000);
    	p2.setF_pr(2000000);
    	p2.setTeam("RCB");
    	
    	AuctionList p3=new AuctionList();
    	p3.setAuc_id(3);
    	p3.setPlayer_name("Shai Hope");
    	p3.setB_pr(7500000);
    	p3.setF_pr(7500000);
    	p3.setTeam("DC");
    	
    	AuctionList p4=new AuctionList();
    	p4.setAuc_id(4);
    	p4.setPlayer_name("Mohammad Nabi");
    	p4.setB_pr(15000000);
    	p4.setF_pr(15000000);
    	p4.setTeam("MI");
    	
//    	s.save(p1);    //inserting data
//    	s.save(p2);
//    	s.save(p3);
//    	s.save(p4);
//    	
//    	

    	
//    	List<AuctionList> lis=auc.getAll() ;
//    	
//    	for(AuctionList a: lis) {
//    		System.out.println(a);   // displaying the list
//    	}
//    	

    	
//    	String res = auc.delete(1);     // delete data
//    	System.out.println(res);

    	
    	AuctionList a1=auc.getById(2);
    	
    	System.out.println(a1);
    	
    	
    	
    	t.commit();

    	s.close();
    	sf.close();
    }
}
