package com.abstraction;

interface  Polygon1 {
	   void getArea();
	  
	 // calculate the perimeter of a Polygon
	   default void getPerimeter(int... sides) {
	      int perimeter = 0;
	      for (int side: sides) {
	         perimeter += side;
	      }

	   System.out.println("Perimeter: " + perimeter);
	   }
	}

 class Interface_7 implements Polygon1 {
	   private int a, b, c;
	   private double s, area;

	// initializing sides of a triangle
	   Interface_7(int a, int b, int c) {
	      this.a = a;
	      this.b = b;
	      this.c = c;
	      s = 0;
	   }

	// calculate the area of a triangle
	   public void getArea() {
	      s = (double) (a + b + c)/2;
	      area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	      System.out.println("Area: " + area);
	   }
	

	
	   public static void main(String[] args) {
		   Interface_7 t1 = new Interface_7(2, 3, 4);

	
	      t1.getArea();

	      t1.getPerimeter(2, 3, 4);
	   }
	}


