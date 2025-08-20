package coreJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException a) {
			
			System.out.println("give the non zero denominator");
		}
		catch(NegativeArraySizeException b) {
			System.out.println("give the size as positive");
		}
		catch(InputMismatchException c) {
			System.out.println("give integer input");
			
		}
		catch(ArrayIndexOutOfBoundsException d) {
			System.out.println("be in the limits");
		}
		catch(Exception e) {
			System.out.println("Invalid input");
		}
		
	

	}

}
