package com.gentech.oops;
class Vehical
{
	public void wheels()
	{
		System.out.println("number of Wheels");
	}
}
class Car extends Vehical
{
	public void wheels()
	{
		System.out.println("number of wheels in car is 4");
	}
}
class Truck extends Vehical
{
	public void wheels()
	{
		System.out.println("The Number of wheels in Truck is 6");
	}
}
class Bus extends Vehical
{
	public void wheels()
	{
		System.out.println("The Number of Wheels in the Busses is 8");
	}
}
public class Polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehical vehical=new Vehical();
		Car car =new Car();	
		Bus bus=new Bus();	
		Truck truck=new Truck();
		
		vehical=car;
		vehical.wheels();
		
		vehical=truck;
		vehical.wheels();
		
		vehical=bus;
		vehical.wheels();
		
	}

}
