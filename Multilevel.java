package coreJava;
class Parent{
	float height=5.1f;
	void eating() {
		System.out.println("i love eatting ");
	}
}
class Child1 extends Parent{
	int money=2000;
}
class Child2 extends Child1{
	
}

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c=new Child2();
		System.out.println(c.height);
		c.eating();
		System.out.println(c.money);
		

	}

}
