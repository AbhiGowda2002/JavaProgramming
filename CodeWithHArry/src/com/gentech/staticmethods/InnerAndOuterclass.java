package com.gentech.staticmethods;
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

public class InnerAndOuterclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank axis=new Bank();
		axis.setaccountno(20112011);
		axis.setaccountholdername("Abhishek");
		
		int accno=axis.getaccountno();
		System.out.println(axis.getaccountno());
		
		String s=axis.getaccountholdername();
		System.out.println(axis.getaccountholdername());
		
	}

}
