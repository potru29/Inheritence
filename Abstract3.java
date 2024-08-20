import java.lang.Math;

abstract class Shape {
    abstract void Area();
}

class Circle extends Shape {
    void Area() {
        float PI = 3.14f;
        int r = 5;
        double area = PI * Math.pow(r, 2);

        System.out.println("cirle Area:" + area);
    }

}

class Rectangle extends Shape {
    void Area() {
        int l = 5;
        int b = 5;
        int area = l * b;
        System.out.println("Rectangle Area:" + area);
    }

}

public class Abstract3 {
    public static void main(String[] args) {
        Shape a = new Circle();
        Shape b = new Rectangle();
        a.Area();
        b.Area();

    }

}
