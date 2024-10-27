package com.gentech.programs;

import java.util.Scanner;

public class Demoo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your name");
		Scanner sc =new Scanner(System.in);
		String name=sc.next();
		name=name.replace(" ","_");
		
		System.out.println(name);
		
	}

}
