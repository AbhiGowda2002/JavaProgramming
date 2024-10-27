package com.gentech.programs;

class Shape {
 
 void calculateArea() {
     System.out.println("Calculating area of a shape...");
 }
}
class Circle extends Shape {
 
 void calculateArea() {
     double radius = 7;
     double area = Math.PI * radius * radius;
     System.out.println("Area of Circle: " + area);
 }
}
class Rectangle extends Shape {
 void calculateArea() {
     double length = 10;
     double breadth = 5;
     double area = length * breadth;
     System.out.println("Area of Rectangle: " + area);
 }
}
class Triangle extends Shape {
 void calculateArea() {
     double base = 8;
     double height = 6;
     double area = 0.5 * base * height;
     System.out.println("Area of Triangle: " + area);
 }
}

public class init {
    public static void main(String[] args) {
        Shape shape=null;
        Circle circ=new Circle();
        Rectangle rect=new Rectangle();
        Triangle tri=new Triangle();
        
        shape=circ;
        shape.calculateArea();
        
        shape=rect;
        shape.calculateArea();
        
        shape=tri;
        shape.calculateArea();
    }
}
