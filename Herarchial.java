package coreJava;
class car1{
	int wheel=4;
	float diesel=4.0f;
	void speed() {
		System.out.println("the speed is medium");
	}
	void color() {
		System.out.println("itz always black");
	}
}
class Bmw extends car1{
	float cost=5000000.0f;
	
}
class Creta extends car1{
	float cost=200000.0f;
	
}

public class Herarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Bmw c1=new Bmw();
   c1.speed();
	System.out.println();
	Creta c2=new Creta();
    c2.speed();
    c2.color();
	}

}
