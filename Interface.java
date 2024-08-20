interface Inf1 {
    int a = 100; // final int a=100 ;

    int add(int a, int b); // abstract int add(int a,int b);

}

class One implements Inf1 {
    public int add(int x, int y) {
        return x + y;
    }

}

public class Interface {
    public static void main(String[] args) {
        Inf1 o1 = new One();
        int r = o1.add(10, 20);
        System.out.println(r);

    }
}