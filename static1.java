package coreJava;
class Test{
	static int a,b;
	static {
		System.out.println("Inside static block");
	  a=10;
	  b=20;
	}
	static void fun1() {
		System.out.println("Inside static  method");
	}
	int x,y;
	
	{
		//instance block
		System.out.println("Inside the instant block");
	}
	void fun2() {
		System.out.println("Inside Instance Method");
	}
	Test(){
		System.out.println("Inside the Constructor");
		x=30;
		y=40;
	}
}
public class static1 {

	public static void main(String[] args) {
	
		Test.fun1();
		Test t=new Test();
		t.fun2();

	}

	

}
