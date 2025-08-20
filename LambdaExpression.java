package coreJava;
interface Display{
	void disp(int a);
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Display d=(int a)->{System.out.println(a);};//lambda expression
        //to check wheather it is working or not give the parameter in the disp expression
        d.disp(2);
	}

}
