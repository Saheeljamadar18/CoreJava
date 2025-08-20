package coreJava;

import java.util.Scanner;

class Demo1111{
    // Method ducks the exception
    void alpha() throws Exception {
        System.out.println("Connection established2");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numerator");
        int a = sc.nextInt();

        System.out.println("Enter the denominator");
        int b = sc.nextInt();

        int c = a / b;  // may throw ArithmeticException
        System.out.println("Result: " + c);

        System.out.println("Connection terminated2");

        sc.close();
    }
}

public class DuckingtheException {
    public static void main(String[] args) {
        Demo111 d = new Demo111();

        try {
            d.alpha(); // calling method that ducks the exception
        } catch (Exception e) {
            System.out.println("Handled in main: " + e.getMessage());
        }

        System.out.println("Program continues after handling...");
    }
}

