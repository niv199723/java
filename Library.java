package com.deloitte.employee;

public class Library {
		private static int bookid;
		private String bookname;
		private String bookauthor;
		private int price;
		private static int counter;
		public static int getCounter() {
			return counter;
		}
		public static void setCounter(int counter) {
			Library.counter = counter;
		}
		static {
			counter=1001;
		}
		public static int getBookid() {
			return bookid;
		}
		public static void setBookid(int bookid) {
			Library.bookid = counter++;
		}
		public String getBookname() {
			return bookname;
		}
		public void setBookname(String bookname) {
			this.bookname = bookname;
		}
		public String getBookauthor() {
			return bookauthor;
		}
		public void setBookauthor(String bookauthor) {
			this.bookauthor = bookauthor;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Library [bookid id="+ counter++ +"bookname=" + bookname + ", bookauthor=" + bookauthor + ", price=" + price + "]";
		}
		
}
