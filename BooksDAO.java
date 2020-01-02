package com.deloitte.library.dao;

import java.sql.*;

import com.deloitte.library.model.Library;

public class BooksDAO {
    	public static Connection connectToDB() {
    		Connection connection = null;
    		try {
    			//RRegister the driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
				return connection;
			} catch (ClassNotFoundException |SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} 
    	}
    	public static void addBook(Library lb) {
    		System.out.println(lb);
    		
    		//step 3 create the stat
    		Connection connection =connectToDB();
    		try {
				PreparedStatement stmt=connection.prepareStatement("insert into book values(?,?,?,?)");
				stmt.setInt(1,lb.getBookid());
				stmt.setString(2, lb.getBookname());
				stmt.setString(3, lb.getBookauthor());
				stmt.setInt(4, lb.getPrice());
				//step 4 execute sql query
				int affectedRows= stmt.executeUpdate();
				System.out.println("affected rows=" +affectedRows);
				ResultSet rs =stmt.executeQuery("Select * from book");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getInt(4));
					connection.close();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
}

