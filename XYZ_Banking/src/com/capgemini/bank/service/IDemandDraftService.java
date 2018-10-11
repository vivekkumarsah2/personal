package com.capgemini.bank.service;

import com.capgemini.bank.bean.DemandDraft;

public interface IDemandDraftService
{
	int addDemandDraftDetails (DemandDraft demandDraft);
	DemandDraft getDemandDraftDetails (int transactionId);
}
