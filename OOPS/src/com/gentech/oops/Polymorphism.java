package com.gentech.oops;
class GeometricFigures
{
	public void area()
	{
		System.out.println("The area is");
	}
}
class Square extends GeometricFigures
{
	public void area()
	{
		int side=12;
		System.out.println(side*side);
	}
}
class Rectangele extends GeometricFigures
{
	public void area()
	{
		int length=10;
		int breadth=10;
		System.out.println(length*breadth);
	}
}
class circle extends GeometricFigures
{
	public void area()
	{
		int radius=10;
		System.out.println(2*3.142*radius);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricFigures figure=new GeometricFigures();
		Square square=new Square();
		Rectangele rect=new Rectangele();
		circle circ=new circle();
		
		figure=square;
		figure.area();
		
		figure=rect;
		figure.area();
		
		figure=circ;
		figure.area();
		
		
		
	}

}
