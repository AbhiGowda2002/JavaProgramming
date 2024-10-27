package com.gentech.Exceptionhandling;
class Example 
{
   
    static void eligibleForVoting(int age) throws Exception 
    {
        if (age < 18) 
        {
            throw new Exception("Age should be greater than 18 to be eligible for voting.");
        }
        else 
        {
            System.out.println("Eligible for voting");
        }
    }
}


public class Demo10 {

	public static void main(String[] args) {

        try {
            Example.eligibleForVoting(16); 
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }

        try {
          Example.eligibleForVoting(20); 
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
    }
}