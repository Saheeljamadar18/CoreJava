package coreJava;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=a/b;
         System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Give non-zero denominator");
		}
		System.out.println("Connection termination");
	}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
	// at coreJava.Exception1.main(Exception1.java:12)
	//DEH--default exception handler
	//rts---take the object and hands it to the deh----rts ----
	//abrupt termination---itz we dengerous and the change is required 
	//exception --it occurs when the input leads to the abrupt termination
	//try-catch-----UDEH---user defined Exception Handler
	//
}
