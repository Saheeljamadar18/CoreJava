package coreJava;


public class CarShowroom {
	static int i=1;

	public static void main(String[] args) {//why the main method is static jvm call the method
		//bcz jvm did not need to create the object---//it need the easy access----
		//conclusion there are static members-----static
		//instance members ------instance
		System.out.println(++i);

	}

}
