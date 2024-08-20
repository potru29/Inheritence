class Base {
    int a, b;

    Base(int a, int b) {
        System.out.println("Base parameterized constructor...");
        this.a = a;
        this.b = b;
    }

    void Display() {
        System.out.println("Base display");
        System.out.println("a:/t" + a);
        System.out.println("b:/t" + b);
    }

}

class Child extends Base {
    int c, d;

    Child(int c, int d) {
        super(10, 20);
        this.c = c;
        this.d = d;
        System.out.println("child parametarized constructor");

    }

    void Hi() {
        System.out.println("child display");
        System.out.println("c:/t" + c);
        System.out.println("d:/t" + d);
    }

}

public class Simpleinheritence {
    public static void main(String[] args) {
        Child c1 = new Child(10, 20);
        c1.Display();
        c1.Hi();

    }
}