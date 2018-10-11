package com.capgemini.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.ui.Client;

public class DemandDraftDAO implements IDemandDraftDAO
{
	static Logger Log=Logger.getLogger(Client.class.getName());
	
	private static java.sql.Date convertUtilToSql(java.util.Date d){
		
		java.sql.Date sd = new java.sql.Date(d.getTime());
		return sd;
		
	}
	
	public int addDemandDraftDetails (DemandDraft dd)
	{
		Scanner sc = new Scanner(System.in);

//		creating connection with Oracle database
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:XE" ;
		String user = "hr";
		String pass = "hr";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		Connection created
//		System.out.println("Connected ...");
		
//		taking user input and inserting into the table
		String sql = "insert into demand_draft values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
//		generate transaction id
		String sql1 = "select Transaction_Id_Seq.nextval from dual";		 
		PreparedStatement ps1 = null;
		try {
			ps1 = con.prepareStatement(sql1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = ps1.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while(rs.next())
				dd.setTransaction_id(rs.getInt(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		generate date
		java.util.Date d = new java.util.Date();
		java.sql.Date sd = convertUtilToSql(d);
		
		
		try {
			ps.setInt(1, dd.getTransaction_id());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			ps.setString(2,dd.getCustomer_name());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			ps.setString(3,dd.getIn_favor_of());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			ps.setString(4,dd.getPhone_number());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			ps.setDate(5, sd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			ps.setInt(6,dd.getDd_amount());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			ps.setInt(7, dd.getDd_commission());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			ps.setString(8,dd.getDd_description());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
		
		return dd.getTransaction_id();
	}
	
	public DemandDraft getDemandDraftDetails (int tid)
	{
		Log.info("Your Demand Draft request has been successfully registered along with the "+tid);
		return null;
	}
}
