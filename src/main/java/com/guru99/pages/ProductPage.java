package com.guru99.pages;

public class ProductPage {
	
	private String URL = "https://demo.guru99.com/payment-gateway/index.php";
	private String quantity = "//*[@name='quantity']";
	private String buyNow = "//*[@type='submit']";
	private String box = "//*[@class='cb-close']";
	
	
	public String getURL() {
		return URL;
	}
	public String getQuantity() {
		return quantity;
	}
	public String getBuyNow() {
		return buyNow;
	}
	
	public String getBox() {
		return box;
	}
	

}
