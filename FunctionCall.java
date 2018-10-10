package com.capgemini.core;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class FunctionCall {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE" ;
		String user = "hr";
		String pass = "hr";
		Connection con = DriverManager.getConnection(url, user, pass);
		
		CallableStatement cs = con.prepareCall("{?= call select_fun(?)}");
		
		cs.setInt(2, 567);
		cs.registerOutParameter(1, Types.VARCHAR);
		cs.execute();
		System.out.println(cs.getString(1));

	}

}
