package coreJava;

import java.util.Scanner;

//why the static is given in the program
class BusinessMan{
	float si;
	float p;
	float t;
	
	  static float  r=15.2f;
	  static {
		  r=15.2f;
	  }
	 
	void acceptInput(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the principle amount");
		p=scan.nextFloat();
		System.out.println("Enter the tenure");
		t=scan.nextFloat();
	 
		
		
	}void calculate(){
		si=(p*t*r)/100;
	}void disp(){
		System.out.println("The SI is"+" "+si);
	}
}

public class Staticwhy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   BusinessMan b=new BusinessMan();
   b.acceptInput();
   b.calculate();
   b.disp();
	
	BusinessMan b1=new BusinessMan();
	b1.acceptInput();
	b1.calculate();
	b1.disp();
	BusinessMan b2=new BusinessMan();
	b2.acceptInput();
	b2.calculate();
	b2.disp();
	}

}
