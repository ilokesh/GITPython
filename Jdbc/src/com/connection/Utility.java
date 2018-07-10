package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Utility {


	public static Object getObject;
	public static Connection getConnection(){
		Connection con=null;
		Statement stmt=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/jdbc","root","root");  
			if(con != null){
				System.out.println("connection established");
				System.out.println(con);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return con;
		
	}
	public static void main(String[] args) {
		Connection con = Utility.getConnection();
	}

}
