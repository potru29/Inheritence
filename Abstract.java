abstract class Base {
    abstract void add(int a, int b);

    void sub(int a, int b) {
        System.out.printf("%d-%d=%d", a, b, (a - b));
    }

}

class Child extends Base {
    void add(int a, int b) {
        System.out.printf("%d+%d=%d\n", a, b, (a + b));

    }
}

public class Abstract {
    public static void main(String[] args) {
        Base b = new Child();
        b.add(10, 2);
        b.sub(10, 2);

    }
}
