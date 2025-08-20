package coreJava;
class Parent22{
	Parent22(){
		System.out.println("Inside the parent class");
	}
}
class Child22 extends Parent22{
	Child22(){
		System.out.println("Inside the child constructor");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child22 c=new Child22();

	}

}
