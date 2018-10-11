package com.capgemini.bank.dao;

import com.capgemini.bank.bean.DemandDraft;

public interface IDemandDraftDAO
{
	int addDemandDraftDetails (DemandDraft demandDraft);
	DemandDraft getDemandDraftDetails (int transactionId);
}
