package com.gentech.oops;
class practice
{
	public int getaddition(int x,int y)
	{
		int res=x+y;
		return res;
	}
}
class Methods
{
	public void getsumofnum()
	{
		int x=50;
		int y=50;
		int sum=x+y;
		System.out.println(sum);
	}
}
class Constructor
{
	Constructor()
	{
		int age=20;
		String name="Abhishek";
		System.out.println(age);
		System.out.println(name);
	}
}
class parameterconstructor
{
	String firstname;
	int Age;
	parameterconstructor(int age,String name)
	{
		this.firstname=name;
		this.Age=age;
		System.out.println(name);
		System.out.println(age);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice o=new practice();
		System.out.println(o.getaddition(10, 10));
		System.out.println("--------------------");
		Methods o1=new Methods();
		o1.getsumofnum();
		System.out.println("-----------------------");
		Constructor o2=new Constructor();
		System.out.println("-----------------------");
		parameterconstructor o3=new parameterconstructor(22,"Abhishek");
		
	}

}
