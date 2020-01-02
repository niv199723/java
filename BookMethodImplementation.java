package com.deloitte.library.bookservices;

import com.deloitte.library.dao.BooksDAO;
import com.deloitte.library.model.Library;

public class BookMethodImplementation implements BookInterface {

	@Override
	public void addBooks(String bookname, String bookauthor, String price) {
		// TODO Auto-generated method stub
		Library lb = new Library();
		lb.setBookid(lb.getCounter());
		lb.setBookname(bookname);
		lb.setBookauthor(bookauthor);
		lb.setPrice(Integer.parseInt(price));
		BooksDAO.addBook(lb);
		
	}

	@Override
	public Library[] displayAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
