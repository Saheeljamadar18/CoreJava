package coreJava;
class Employee{
	
	
	@Override
	public String toString() {
		return "hi";
	}
	//to the array it inherited
	//but in string it is overridden
	/*
	 * Object
	 */
	
}

public class toStringmethod {

	public static void main(String[] args) {
	Employee e=new Employee();
	System.out.println(e);
	
	
	}

}
