package coreJava;

import java.util.Scanner;

abstract class Shape {
    float area;
    abstract void acceptInput();
    abstract void Calculate();
    void Result() {
        System.out.println("The area is: " + area);
    }
}

class Circle extends Shape {
    float radius;
    @Override
    void acceptInput() {
        System.out.println("Enter the radius:");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();
    }
    @Override
    void Calculate() {
        area = (float)Math.PI * radius * radius; // fixed formula
    }
}

class Rectangle extends Shape {
    float length, breadth;
    @Override
    void acceptInput() {
        System.out.println("Enter the length and the breadth:");
        Scanner sc = new Scanner(System.in);
        length = sc.nextFloat();
        breadth = sc.nextFloat();
    }
    @Override
    void Calculate() {
        area = length * breadth;
    }
}

class Square extends Shape {
    float side;
    @Override
    void acceptInput() {
        System.out.println("Enter the side:");
        Scanner sc = new Scanner(System.in);
        side = sc.nextFloat();
    }
    @Override
    void Calculate() {
        area = side * side;
    }
}

class Geometric {
    public void permit(Shape ref) {
        ref.acceptInput();
        ref.Calculate();
        ref.Result();   // added this
    }
}

public class Abstractionpolymorphisminheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();
        Geometric g = new Geometric();

        g.permit(r);
        g.permit(s);
        g.permit(c);
    }
}
