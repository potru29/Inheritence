import java.lang.Math;
import java.util.Scanner;

abstract class Shape {
    abstract void Area();

}

class Circle extends Shape {
    float r;

    Circle(float r) {
        this.r = r;
    }

    void Area() {
        float PI = 3.14f;
        double area = PI * Math.pow(r, 2);
        System.out.println("cirle Area:" + area);
    }

}

class Rectangle extends Shape {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void Area() {
        int area = l * b;
        System.out.println("Rectangle Area:" + area);
    }

}

public class Abst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter r value");
        float r = sc.nextFloat();
        System.out.println("enter l value");
        int l = sc.nextInt();
        System.out.println("enter b value");
        int b = sc.nextInt();
        Shape a = new Circle(r);
        Shape a1 = new Rectangle(l, b);
        a.Area();
        a1.Area();
        sc.close();

    }

}
