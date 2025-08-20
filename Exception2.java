package coreJava;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connection is established!!!");
		try {
		Scanner sc=new Scanner(System.in);
		//Array OPERATIONS-----
		int size=sc.nextInt();
      int arr[]=new int[size];
      int data=sc.nextInt();
      System.out.println("enter the index where the data to be inserted!!!");
      int index=sc.nextInt();
      arr[index]=data;
      System.out.println(arr[index]);
		}
		catch(Exception e) {
			System.out.println("it going to terminate");
		}
      System.out.println("connection is terminated!!!!");
      
	}//Arthematic exception
	//negative array Size exception
	//Input mismatch exception
	//ArrayIndex out of bound
	

}
//negative array size exception//
/*
 * 3
saheel
it going to terminate   Input mismatch exception
connection is terminated!!!!
the change int the array Index out of bound -----
the change 
 */
