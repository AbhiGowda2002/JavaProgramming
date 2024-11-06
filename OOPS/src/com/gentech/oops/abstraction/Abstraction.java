package com.gentech.oops.abstraction;
abstract class College
{
	abstract void showcollegename(String name);
	
	abstract void showcollegeId(int id);
	
	void showcources(String cources)
	{
		System.out.println(cources);
	}
}
class Students extends College
{

	@Override
	void showcollegename(String name) {
		System.out.println(name);
		
	}

	@Override
	void showcollegeId(int id) {
		
		System.out.println(id);
	}
	
	void getStudentsname(String name)
	{
		System.out.println(name);
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students students=new Students();
		
		students.showcollegeId(11);
		students.showcollegename("Bangalore Institute of Technology");
		students.showcources("CS,IS,MECH,CIVIL,EEE");
		
		students.getStudentsname("Abhishek");
	}

}
