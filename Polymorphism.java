package coreJava;
class Plane{
	public void fly() {
		System.out.println("fly in the sky");
	}
	
}
class CargoPlane extends Plane{
	@Override
	public void fly() {
		System.out.println("fly at the low height");
	}
}
class Passenger extends Plane{
	@Override
	public void fly() {
		System.out.println("fly at the medium height");
	}
}
class FighterPlane extends Plane{
	@Override
	public void fly() {
		System.out.println("fly at the top most");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane ref;
		
		CargoPlane cp=new CargoPlane();
		Passenger pp=new Passenger();
		FighterPlane fp=new FighterPlane();
		ref=cp;
		ref.fly();
		ref=pp;
		ref.fly();
		ref=fp;
		ref.fly();

	}

}
