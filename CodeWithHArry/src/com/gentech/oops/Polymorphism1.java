package com.gentech.oops;
 class Geomrtricfigure 
{
	 void area()
	{
		System.out.println("Area is ");
	}
}
class square extends Geomrtricfigure 
{
	void area()
	{
		int side=12;
		System.out.println(side*side);
	}
}
class rectangle extends Geomrtricfigure 
{
	void area()
	{
		int length=12;int breadth=12;
		System.out.println(length*breadth);
	}
}
class circle extends Geomrtricfigure
{
	void area()
	{
		int radius =4;
		System.out.println(2*3.144*radius);
	}
}
public class Polymorphism1 {

	public static void main(String[] args) {
		Geomrtricfigure o=new Geomrtricfigure() ;
		square o1=new square();
		rectangle o2=new rectangle();
		circle o3=new circle();
		o=o1;
		o.area();
		o=o2;
		o.area();
		o=o3;
		o.area();

	}

}
