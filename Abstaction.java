package coreJava;
abstract class Bird{
	abstract void fly();
	abstract void eat();
}
abstract class Eagle extends Bird{
	 @Override
	void fly() {
		// TODO Auto-generated method stub
		 System.out.println("Eagle fly in high of the sky");
		
	}
	 
	
}
class GoldenEagle extends Eagle{
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat fishes");
		
	}
}
class SerpantEagle extends Eagle{
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat snakes");
		
	}
}
class EagleFamily{
	public void permit(Eagle ref) {
		
		ref.eat();
		ref.fly();
	}
}
public class Abstaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoldenEagle ge=new GoldenEagle();
		SerpantEagle se=new SerpantEagle();
		EagleFamily ef=new EagleFamily();
		ef.permit(se);
		ef.permit(ge);
		

	}

}
