package com.gentech.oops;
class Bank
{
	private int Accountno;
	private String Accountholdername;
	
	public int getaccountno()
	{
		return Accountno;
	}
	public void setaccountno(int accountno) 
	{
		this.Accountno=accountno;
	}
	public String getaccountholdername()
   
	{
		return Accountholdername;
	}
	public void setaccountholdername(String accountholdername)
	{
		this.Accountholdername=accountholdername;
	}
}

public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank axis =new Bank();
		axis.setaccountno(21221222);
		axis.setaccountholdername("Abhishek s");
		
		String s=axis.getaccountholdername();
		System.out.println(s);
		
		int accno=axis.getaccountno();
		System.out.println(accno);
	}

}
