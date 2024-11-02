package com.gentech.interview;	
class Animal
{
	String name;
	int age;
	Animal()
	{
		name="tiger";
		age=21;
		System.out.println("The Execution of NOArgs Constructor :" +name);
		System.out.println("The Execution of NOArgs Constructor :"+age );
		
	}
	Animal(String firstname,int age  )
	{
		name=firstname;
		age=age;
		System.out.println("The Execution of parameter Constructor :"+name);
		System.out.println("The Execution of parameter Constructor :"+age);
	}
}

public class NoArgsConstructor {
	public static void main(String[] args) {
		
		Animal o1=new Animal();
		System.out.println("----------------");
		Animal o2=new Animal(" Elephant", 22);
		
		
	}

}
