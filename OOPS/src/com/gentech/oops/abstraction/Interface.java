package com.gentech.oops.abstraction;
interface vehical
{
	abstract void start();
	abstract void stop();
}
class Bike implements vehical
{

	@Override
	public void start() {
		System.out.println("The bike is starting ");
		
	}

	@Override
	public void stop() {
		System.out.println("The Bike is stopping");
		
	}
	
}
class Car implements vehical
{
	public void start()
	{
		System.out.println("Car is starting ");
	}
	public void stop()
	{
		System.out.println("car is stopping");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike Ktm=new Bike();
		Car polo=new Car();
		
		Ktm.start();
		Ktm.stop();
		
		polo.start();
		polo.stop();
	}

}
