package coreJava;
//overriding---access modifiers---public private protected default
class sParent123{
	public   void disp() {
		System.out.println("Hi");
	}
}
class Child extends sParent123{
	@Override
	public void disp() {
		System.out.println("hello");
	}
}
//1 at the time of overriding we have to increase the visibility--
//2 its about the return of the method-----we can't change the return type of the overridden method//cannot change the primitive data type we can change it the object
//3 the method can be any thing method can be return object to and the primitive//method can be return any thing object that --is a relationship
//4 at time of the overriding we can't change the  parameter of the value
//if we not give the method overriding-- the method is not  from  the extends itz just specialized method



public class Rulesofmethodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.disp();

	}

}
