package com.padmini.book.database;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.padmini.book.model.BookInfo;


public class BookDao {
	
	public BookInfo addBook(BookInfo book)
	{
		
		Session session =  SessionUtil.getSession();        
        Transaction tx = session.beginTransaction();
        BookInfo b = new BookInfo();
        b.setBook_name(book.getBook_name());
        b.setAuthor(book.getAuthor());
        b.setPrice(book.getPrice());
		session.save(b); 
        tx.commit();
        session.close();
        return book;
	}

	public BookInfo getBook(String book_name, String author)
	{
		Session session =  SessionUtil.getSession();        
        Transaction tx = session.beginTransaction();
		Query q = session.createSQLQuery("Select * from book_info where book_name=:book_name and author=:athor");
		q.setParameter("book_name", book_name);
		q.setParameter("author", author);
		List<?> list = q.list();		
		BookInfo book = (BookInfo)list.get(0);
      //  tx.commit();
        session.close();
		return book;		
	}
	
	public BookInfo upateBook(BookInfo book)
	{
		Session session =  SessionUtil.getSession();        
        Transaction tx = session.beginTransaction();
		Query q = session.createSQLQuery("Select * from book_info where book_name=:book_name");
		q.setParameter("book_name", book.getBook_name());
		List<?> list = q.list();		
		BookInfo b = (BookInfo)list.get(0);
		b.setAuthor(book.getAuthor());
		b.setPrice(book.getPrice());
		session.saveOrUpdate(b);
        tx.commit();
        session.close();
		return b;
		
	}
	
	
	public List<BookInfo> getAllBooks()
	{
		Session session =  SessionUtil.getSession();        
        Transaction tx = session.beginTransaction();
		Query q = session.createSQLQuery("from book_info ");		
		List<BookInfo> list = q.list();	
    //    tx.commit();
        session.close();		
		return list;		
	}
	
	public BookInfo deleteBook(String book_name, String author)
	{
		Session session =  SessionUtil.getSession();        
        Transaction tx = session.beginTransaction();
		Query q = session.createSQLQuery("Select * from book_info where book_name=:book_name and author=:athor");
		q.setParameter("book_name", book_name);
		q.setParameter("author", author);
		List<?> list = q.list();		
		BookInfo book = (BookInfo)list.get(0);
		session.delete(book);
        tx.commit();
        session.close();
		return book;		
	}
	
}
