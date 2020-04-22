package com.cg.bean;

public class Address 
{
	private String name;
	private String addressId;
	private String retailer;
	private String buidingNo;
	private String city;
	private String state;
	private String field;
	private String zip;
	
	public Address() 
	{	}
	
	//Getter / setter
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAddressId()
	{
		return addressId;
	}
	public void setAddressId(String addressId) 
	{
		this.addressId = addressId;
	}
	public String getRetailer() 
	{
		return retailer;
	}
	public void setRetailer(String retailer) 
	{
		this.retailer = retailer;
	}
	public String getBuidingNo() 
	{
		return buidingNo;
	}
	public void setBuidingNo(String buidingNo) 
	{
		this.buidingNo = buidingNo;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public String getState() 
	{
		return state;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public String getField() 
	{
		return field;
	}
	public void setField(String field) 
	{
		this.field = field;
	}
	public String getZip() 
	{
		return zip;
	}
	public void setPin(String zip) 
	{
		this.zip = zip;
	}
	
	//creation of construction
	public Address(String name, String addressId, String retailer, String buidingNo, String city, String state,String field, String zip) 
	{
		super();
		this.name = name;
		this.addressId = addressId;
		this.retailer = retailer;
		this.buidingNo = buidingNo;
		this.city = city;
		this.state = state;
		this.field = field;
		this.zip = zip;
	}

}
