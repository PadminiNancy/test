package com.padmini.book.database;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.padmini.book.model.BookInfo;
import com.padmini.book.model.StatusInfo;
import com.padmini.book.model.UserInfo;

public class StatusDao {
	
	
	public StatusInfo addStatus(StatusInfo status)
	{
		
		Session session =  SessionUtil.getSession();        
        Transaction tx = session.beginTransaction();
        StatusInfo s = new StatusInfo();
        UserInfo u = new UserInfo();
        BookDao bd = new BookDao();
        BookInfo bk = null;
        BookInfo b = new BookInfo();
        b.setBook_id(status.getBookInfo().getBook_id());
        u.setUname(status.getUser().getUname());       
        s.setBookInfo(b);
        s.setUser(u);
        s.setStatus(status.getStatus());
		session.save(s); 
        tx.commit();
        session.close();
        return s;
	}
	
	public StatusInfo updateStatus(StatusInfo status)
	{
		
		Session session =  SessionUtil.getSession();        
        Transaction tx = session.beginTransaction();
        StatusInfo s = new StatusInfo();
        UserInfo u = new UserInfo();
        BookDao bd = new BookDao();
        BookInfo bk = null;
        BookInfo b = new BookInfo();
        b.setBook_id(status.getBookInfo().getBook_id());
        u.setUname(status.getUser().getUname());       
        s.setBookInfo(b);
        s.setUser(u);
        s.setStatus(status.getStatus());
		session.save(s); 
        tx.commit();
        session.close();
        return s;
	}
	
	public StatusInfo getStatus(String status)
	{		
		Session session =  SessionUtil.getSession();        
        Transaction tx = session.beginTransaction();       
        Query q = session.createSQLQuery("Select * from status where status=:status");
		q.setParameter("status", status);		
		List<?> list = q.list();		
		StatusInfo bookStatus = (StatusInfo)list.get(0);
        session.close();
        return bookStatus;
	}

}
