package com.cg.core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.bank.bean.DemandDraft;
import com.capgemini.bank.dao.DemandDraftDAO;

public class junit
{
	@Test
	public void testAddDemandDraftDetails()
	{
		DemandDraft demandDraft = new DemandDraft();
		demandDraft.setCustomer_name("Cname");
		demandDraft.setPhone_number("1234567890");
		demandDraft.setIn_favor_of("XYZ");
		demandDraft.setDd_amount(500);
		demandDraft.setDd_description("Done");
		demandDraft.setDd_commission(356);
		DemandDraftDAO test = new DemandDraftDAO();
		System.out.println(demandDraft.getTransaction_id());
		assertEquals(10016, test.addDemandDraftDetails(demandDraft));
	}
} 
