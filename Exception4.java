package coreJava;

import java.util.Scanner;

class Demo111{
	void alpha() throws Exception{//it give the warning in the main method
		try {
		System.out.println("Connection established2");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numerator");
		int a=sc.nextInt();
		System.out.println("Enter the denominator");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println("Connection terminated2");
		}
		catch(Exception e) {
			System.out.println("handle in alpha");
			throw e;
		}
		finally {
			System.out.println("connection terminated 2");
		}
	}
}

public class Exception4 {
//rethrowing the exception---
	public static void main(String[] args) {
		Demo111 d=new Demo111();
		try {
		d.alpha();
		}
		catch (Exception e) {
			System.out.println("Handle in the main");
		}
		
		
		System.out.println("connection terminated!!!");

	}

}
