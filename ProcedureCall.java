package com.capgemini.core;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProcedureCall {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE" ;
		String user = "hr";
		String pass = "hr";
		Connection con = DriverManager.getConnection(url, user, pass);
		
		CallableStatement cs = con.prepareCall("{call insert_proc(?,?,?)}");
		
		cs.setInt(1, 567);
		cs.setString(2, "mukesh");
		cs.setInt(3, 21000);
		cs.execute();
		System.out.println("procedue executed...");
		con.close();
		
	}

}
