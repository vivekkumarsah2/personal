package com.capgemini.bank.service;

import com.capgemini.bank.bean.DemandDraft;

public class DemandDraftService implements IDemandDraftService
{
	public int addDemandDraftDetails (DemandDraft dd)
	{
		if(dd.getDd_amount()<=5000 && dd.getDd_amount()>=0)
			dd.setDd_commission(10);
		else if(dd.getDd_amount()>=5001 && dd.getDd_amount()<=10000)
			dd.setDd_commission(41); 
		else if(dd.getDd_amount()>=10001 && dd.getDd_amount()<=100000)
			dd.setDd_commission(51);
		else if(dd.getDd_amount()>=100001 && dd.getDd_amount()<=500000)
			dd.setDd_commission(306);
		
		return dd.getDd_commission();
	}
	
	public DemandDraft getDemandDraftDetails (int transactionId)
	{
		
		return null;		
	}
}
