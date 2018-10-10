package com.capgemini.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE" ;
		String user = "hr";
		String pass = "hr";
		Connection con = DriverManager.getConnection(url, user, pass);
		
		String sql = "select * from employee1 where id=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, 123);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getInt("esal"));
			
		}
		con.close();
	}

}
