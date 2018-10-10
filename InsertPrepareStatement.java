package com.capgemini.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPrepareStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE" ;
		String user = "hr";
		String pass = "hr";
		Connection con = DriverManager.getConnection(url, user, pass);
		String sql = "insert into employee1 values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, 456);
		ps.setString(2, "vijay");
		ps.setInt(3, 14000);
		ps.executeUpdate();
		
		System.out.println("1 row inserted...");
		con.close();

	}

}
