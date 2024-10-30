package com.gentech.constructor;

class Human3 {
    String name;
    String mailid;

    Human3(String name, String mailid) {
        this.name = name;
        this.mailid = mailid;
        System.out.println(name);
        System.out.println(mailid);
    }

    void display() {
        System.out.println(name);
        System.out.println(mailid);
    }
}

public class constructorandmethods 
{

    public static void main(String[] args) {
        Human3 o = new Human3("Abhishek", "Abhi@gmail.com");
        o.display();
    }
}