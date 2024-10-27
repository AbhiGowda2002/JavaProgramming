package com.gentech.polymorphism;
interface vehicle
{
	void start();
	void stop();
}
class bike implements vehicle
{
	public void start()
	{
		System.out.println("bike is starting");
	}
	public void stop()
	{
		System.out.println("bike is stopping");
	}
}
class car implements vehicle
{
	public void start()
	{
		System.out.println("car is starting");
	}
	 public void stop()
	{
		System.out.println("car is stopping");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike ktm=new bike();
		car ferari=new car();
		
		ktm.start();
		ktm.stop();
		
		ferari.start();
		ferari.stop();
	}

}
