class Base {
    int a = 100;
    static int s = 200;

    static void fun1() {
        System.out.println(" base class static fun1 method");
    }

    void Display() {
        System.out.println("base class instance display method");
    }
}

class Child extends Base {
    int a = 1000;
    static int s = 2000;

    static void fun1() {
        System.out.println(" child class static fun1 method");
    }

    void Display() {
        System.out.println("child class instance display method");
    }

}

public class UpCastDownCast {
    public static void main(String[] args) {
        // Child b = new Child();
        // Base b=new Base();

        Base b = new Child();
        Child c = (Child) b;
        System.out.println(b.a);
        System.out.println(b.s);
        System.out.println(c.a);
        System.out.println(c.s);

        b.fun1();
        b.Display();
        c.fun1();
        c.Display();
    }
}