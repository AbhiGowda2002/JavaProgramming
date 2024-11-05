package com.gentech.oops;
class Balance
{
	private int Bankbalance;
	
	Balance(int initialbalance)
	{	
		this.Bankbalance=initialbalance;
	}
	
	public int getBankbalance()
	{
		return Bankbalance;
	}
	
	private void setBankbalance(int balance)
	{
		if(balance>0)
		{
			this.Bankbalance=balance;
		}
		else
		{
			System.out.println("There is no balance in the account");
		}
	}
}

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balance balance=new Balance(1001);
		int bal=balance.getBankbalance();
		System.out.println("$"+bal);
	}

}
