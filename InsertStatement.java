package com.capgemini.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1 : loading a driver class and registering it
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//step 2 : establish a connection
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		//thin is  type 4 driver
		String user = "hr";
		String pass = "hr";
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("Connected...");
		
		//create sql statement
		
		Statement st = con.createStatement();
		st.executeUpdate("insert into employee1 values(123, 'rakul', 12000)");
		
		//step 4:
		
		//step 5: close the connection
		
		con.close();
		
		
	}

}
