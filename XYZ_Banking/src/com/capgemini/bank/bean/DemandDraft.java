package com.capgemini.bank.bean;

import java.time.LocalDate;

public class DemandDraft
{
	private Integer transaction_id;
	private String customer_name;
	private String in_favor_of;
	private String phone_number;
	private LocalDate date_of_transaction;
	private Integer dd_amount;
	private Integer dd_commission;
	private String dd_description;
	
	public Integer getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(Integer transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getIn_favor_of() {
		return in_favor_of;
	}
	public void setIn_favor_of(String in_favor_of) {
		this.in_favor_of = in_favor_of;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public LocalDate getDate_of_transaction() {
		return date_of_transaction;
	}
	public void setDate_of_transaction(LocalDate ld) {
		this.date_of_transaction = ld;
	}
	public Integer getDd_amount() {
		return dd_amount;
	}
	public void setDd_amount(Integer dd_amount) {
		this.dd_amount = dd_amount;
	}
	public Integer getDd_commission() {
		return dd_commission;
	}
	public void setDd_commission(Integer dd_commission) {
		this.dd_commission = dd_commission;
	}
	public String getDd_description() {
		return dd_description;
	}
	public void setDd_description(String dd_description) {
		this.dd_description = dd_description;
	}	
}
