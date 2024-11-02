package com.gentech.interview;
class Abhi
{
	public void display(String  car)
	{
		System.out.println(car);
	}
	
	public void show()
	{
		display(this.toString());
	}
}

public class ThisOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abhi o=new Abhi();
		o.display("Maruthi");
		o.show();
	}

}
