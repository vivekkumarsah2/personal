package com.capgemini.bank.ui;

import java.sql.SQLException;
import java.util.Scanner;



import org.apache.log4j.Logger;

import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.dao.DemandDraftDAO;
import com.capgemini.bank.service.DemandDraftService;

public class Client
{
	static Logger Log=Logger.getLogger(Client.class.getName());
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner(System.in);
		Log.info("Enter your choice :");
		Log.info("1) Enter Demand Draft Details\n2) Exit");
		Integer c = sc.nextInt();
		while(c!=1 && c!=2){
			Log.info("Please provide a valid choice\n");
			c = sc.nextInt();
		}
		if(c==1)
		{
			DemandDraft dd = new DemandDraft();
			
			boolean b;
			
//			input for customer name
			b = true;
			while(b)
			{
				Log.info("Enter the name of the customer:");
				dd.setCustomer_name(sc.next());
				if(dd.getCustomer_name().length()>20)
					Log.info("please provide a valid input.");
				else
					b=false;			
			}
			
//			input for in favor of
			b = true;
			while(b)
			{
				Log.info("In favor of:");
				dd.setIn_favor_of(sc.next());
				if(dd.getIn_favor_of().length()>20)
					Log.info("please provide a valid input");
				else
					b=false;
			}
			
//			input for phone no.
			b = true;
			while(b)
			{
				Log.info("Enter customer phone number:");
				dd.setPhone_number(sc.next());
				if(dd.getPhone_number().length()!=10)
					Log.info("please provide a valid input");
				else
					b=false;
			}

//			input for dd amount
			b = true;
			while(b)
			{
				Log.info("Enter Demand Draft amount (in Rs):");
				dd.setDd_amount(sc.nextInt());
				b=false;
			}
			
//			input for description
			b = true;
			while(b)
			{
				Log.info("Enter Remarks:");
				dd.setDd_description(sc.next());
				if(dd.getDd_description().length()>50)
					Log.info("please provide a valid input");
				else
					b=false;
			}
			
			DemandDraftService dds = new DemandDraftService();
			dds.addDemandDraftDetails(dd);
//			dds.getDemandDraftDetails(tids);
			
			DemandDraftDAO ddd = new DemandDraftDAO();
			Integer tidd = ddd.addDemandDraftDetails(dd);
			ddd.getDemandDraftDetails(tidd);
					
		}
		else
			System.exit(0);
		
		sc.close();
	}
	
}
