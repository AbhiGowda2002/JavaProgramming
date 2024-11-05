package com.gentech.oops;
class Bank
{
	private int accountnumber;
	private String AccountHolderName;
	
	public int getacconutnumber()
	{
		return accountnumber;
	}
	public void setaccountnumber(int Accountnumber)
	{
		this.accountnumber=Accountnumber;
		
	}
	public String getAccountHolderName()
	{
		return AccountHolderName;
	}
	public void setAccountHolderName(String name)
	{
		this.AccountHolderName=name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		bank.setAccountHolderName("Abhishek");
		bank.setaccountnumber(10101010);
		
		int v1=	bank.getacconutnumber();
		String str=bank.getAccountHolderName();
		
		System.out.println(v1);
		System.out.println(str);
				
				
	}

}
