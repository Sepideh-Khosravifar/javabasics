package com.sysntax.class16;

public class stringTask6 {
	
public static void main(String[] args) {
		
	//How would you swap 2 strings without a temporary variable?
	
	String a = "one";
	String b = "two";

	a = a + b;
	b = a.substring(0, (a.length() - b.length()));
	a = a.substring(b.length());

	System.out.println("a = " + a);
	
	System.out.println("b = " + b);
	
	
	}

}
