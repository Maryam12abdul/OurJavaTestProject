package com.neotech.review02;

//Homework 5:
//    Write program: Shape class has a constructor that takes
//    the radius and has a subclass as Circle class. In Circle
//    class create a method to calculate the area of circle. Test
//    your code

  class Shape {
	
	int radius;
	
	Shape(int radius){
		
		this.radius=radius;
	}

}

 public class Circle extends Shape{
	
	
	
	    Circle(int radius) {
		super(radius);
		
		
	}
	
	
    void calculateArea() {
	
		
		System.out.println("The area of a circle is "+Math.PI * radius * radius);
	}
    
    public static void main(String[] args) {
		
    	
    	Circle c=new Circle(5);
   		c.calculateArea();
	}
    
  }
   
  
