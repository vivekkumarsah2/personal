package com.capgemini.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		String user = "hr";
		String pass = "hr";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("Connected...");
		
		//executeUpdate will work only for insert update and delete
		Statement st = con.createStatement();
		
		
		ResultSet rs = st.executeQuery("select * from employee1");
		
		while(rs.next()){
			
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}
	}

}
