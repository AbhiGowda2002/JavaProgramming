package com.gentech.programs;

import java.util.Scanner;

public class Conditionademo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the month number");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		String monthname="";
		
		
		if(month==1)
		{
			monthname="january";
		}
		else if (month==2) 
		{
			monthname="Febuary";
		}
		else if (month==3) 
		{
			monthname="March";
		}
		else if (month==4) 
		{
			monthname="April";
		}
		else if (month==5) 
		{
			monthname="May";
		}
		else if(month==6)
		{
			monthname="June";	
		}
		else if (month==7) 
		{
			monthname="July";
		}
		else if (month==8) 
		{
			monthname="August";
		}
		else if (month==9) 
		{
			monthname="September";
		}
		else if (month==10) 
		{
			monthname="October";
		}
		else if (month==11) 
		{
			monthname="November";
		}
		else if (month==12) 
		{
			monthname="December";
		}
		else 
		{
			System.out.println("Invalid Month Number");
		}
		
		System.out.println(" the month name is "+monthname);
	}

}
