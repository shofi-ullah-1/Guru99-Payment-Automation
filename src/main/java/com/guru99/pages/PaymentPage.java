package com.guru99.pages;



public class PaymentPage {
	
	
	private String cardNumber = "//*[@id='card_nmuber']";
	private String month = "//*[@id='month']";
	private String year = "//*[@id='year']";
	private String cvvCode = "//*[@id='cvv_code']";
	private String submit = "//*[@name='submit']";
	private String ordersuccess = "//*[text()='Payment successfull!']";
	
	
	
	public String getCardNumber() {
		return cardNumber;
	}
	public String getMonth() {
		return month;
	}
	public String getYear() {
		return year;
	}
	public String getCvvCode() {
		return cvvCode;
	}
	public String getSubmit() {
		return submit;
	}
	public String getOrdersuccess() {
		return ordersuccess;
	}
	
	
}
