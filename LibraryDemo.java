package com.deloitte.employee;

import java.util.Scanner;

import java.util.ArrayList;
public class LibraryDemo {
	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		ArrayList<Library> list = new ArrayList<Library>();
		while(true) {
		System.out.println("Please enter 1 to add new book"
		+" option 2 to display"
		+" option 3 exit");
		BookMethodImplementation bookMethodimpl = new BookMethodImplementation();
		
		String option =scr.next();

		switch(option) {
		case "1":
			System.out.println("Enter book name");
			String bookname = scr. next();
			System.out.println("Enter book author");
			String bookauthor = scr.next();
			System.out.println("Enter price of the book");
			String price = scr.next();
		    Library lb=bookMethodimpl.addBooks(bookname, bookauthor, price);
			list.add(lb);
			break;
			
		case "2":
			for(Library lbobj:list) {
				System.out.println(lbobj);
			}
			break;
			
		case "3":
			System.exit(0);
				
		}
		}
		
		
	}
}
