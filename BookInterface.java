package com.deloitte.library.bookservices;

import com.deloitte.library.model.Library;

public interface BookInterface {
		public void addBooks(String bookname,String bookauthor, String price);
		public Library[] displayAllBooks();
}
