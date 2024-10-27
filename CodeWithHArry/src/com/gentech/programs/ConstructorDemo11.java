package com.gentech.programs;

import java.util.Scanner;

public class ConstructorDemo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter the weekday number");
     Scanner sc=new Scanner(System.in);
     int day=sc.nextInt();
     String weekday="";
     
     if(day==1)
     {
    	 weekday="Sunday";
     }
     else if(day==2)
     {
    	 weekday="Monday";
     }
     else if(day==3)
     {
    	 weekday="Tuesday";
     }
     else if(day==4)
     {
    	 weekday="Wednesday";
     }
     else if(day==5)
     {
    	 weekday="Thursday";
     }
     else if(day==6)
     {
    	 weekday="Friday";
     }
     else if(day==7)
     {
    	 weekday="Saturday";
     }
     else
     {
    	 System.out.println("invalid number");
     }
     System.out.println(weekday);
	}

}
