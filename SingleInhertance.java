package coreJava;


	//parent
	//super
	//base
	//child
	//sub
	//derived
	class Parents11{
		float height=6.0f;
		String SkinColor="brown";
		String eyeColor="Brown";
		void readBooks() {
			System.out.println("i love reading books");
		}
		void noDrink() {
			System.out.println("i hate drinking");
		}
		void noSmoke() {
			System.out.println("i hate smoking");
		}
	}
	class Childs11 extends Parents11{
		
	}
	public class SingleInhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childs11 c=new  Childs11();
		c.readBooks();
	System.out.println(c.height);

	}

}
