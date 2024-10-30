package com.gentech.practice2;
class Human
{
	String firstname;
	String emailid;
	int age ;
	Human()
	{
		firstname="Abhishek";
		emailid="abhi@gmail.com";
		int age=22;
		System.out.println(firstname);
		System.out.println(emailid);
		System.out.println(age);
		System.out.println("----------------");
	}
}

class Human2
{
	String collegename;
	String email;
	String address;
	Human2()
	{
		collegename="BIT";
		email="BIT@gmail.com";
		address="KR ROAD BANGALORE";
		System.out.println(collegename);
		System.out.println(email);
		System.out.println(address);
		System.out.println("--------------");
	}
}
class Human3
{
	String firstname;
	String mailid;
	int age ;
	Human3()
	{
		firstname="Anju";
		mailid="anju@gmail.com";
		age=22;
		System.out.println(firstname);
		System.out.println(mailid);
		System.out.println(age);
		System.out.println("---------------");
	}
}



public class Constructordemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human o =new Human();
		Human2 obj=new Human2();
		Human3 o2=new Human3();
		
		
	}

}
