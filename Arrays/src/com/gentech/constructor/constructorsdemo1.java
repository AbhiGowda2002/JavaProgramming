package com.gentech.constructor;
 class Human1
{
	String firstname;
	int age;
	
	Human1()
	{
		firstname="santosh";
		age=18;
		System.out.println(firstname);
		System.out.println(age);
		System.out.println("+++++++++++++");
	}
}
 class product1
{
	String productname;
	int productprice;
	String producttype;
	product1()
	{
		productname="Samsung";
		productprice=25000;
		producttype="Mobile";
		System.out.println(productname);
		System.out.println(productprice);
		System.out.println(producttype);
		System.out.println("++++++++++++");
	}
}
class animal
{
	String animalname;
	String animaltype;
	animal()
	{
		animalname="Tiger";
		animaltype="Wild Anilam";
		System.out.println(animalname);
		System.out.println(animaltype);
		System.out.println("++++++++++++++++");
	}
}
class cource
{
	String courcename;
	int courcefees;
	cource()
	{
		courcename="Full Stack Development";
		courcefees=50000;
		System.out.println(courcename);
		System.out.println(courcefees);
		System.out.println("+++++++++++++++");
	}
}
class Teacher
{
	String Teachername;
	String Subject;
	int salary;
	Teacher()
	{
		Teachername="Prabhakar";
		Subject="Core Java";
		salary=100000;
		System.out.println(Teachername);
		System.out.println(Subject);
		System.out.println(salary);
		System.out.println("++++++++++++++"); 
	}
	
}
class college
{
	String collegename;
	String address;
	String branches;
	college()
	{
		collegename="Bangalore Institute of Technology";
		address="KR Road";
		branches="CSE, MECH, civil, ECE";
		System.out.println(collegename);
		System.out.println(address);
		System.out.println(branches);
		System.out.println("+++++++++++++++");
	}
}
class shops
{
	shops()
	{
		String shopname="MAHAVEER";
		String shoptype="Provision Shop";
		String shopadd="Vijayanagara bangalore";
		System.out.println(shopname);
		System.out.println(shoptype);
		System.out.println(shopadd);
		System.out.println("++++++++++");
		
	}
}
public class constructorsdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human1 obj=new Human1();
		product1 obj1=new product1();
		animal obj2=new animal();
		cource obj3=new cource();
		Teacher obj4=new Teacher();
		college obj5=new college();
		shops obj6=new shops();

	}
}
