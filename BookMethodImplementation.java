package com.deloitte.employee;

public class BookMethodImplementation implements BookInterface {

	@Override
	public Library addBooks(String bookname, String bookauthor, String price) {
		// TODO Auto-generated method stub
		Library lb = new Library();
		lb.setBookname(bookname);
		lb.setBookauthor(bookauthor);
		lb.setPrice(Integer.parseInt(price));
		return lb;
	}

	@Override
	public Library[] displayAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
