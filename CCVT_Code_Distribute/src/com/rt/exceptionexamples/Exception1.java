package com.rt.exceptionexamples;

class Exception1 {
public static void main(String args[]) {
try{  
	int d = 0;
	int a = 42 / d;  
 }catch(ArithmeticException e){System.out.println(e);}
System.out.println("Divide By Zero exception resolved.");
}
}