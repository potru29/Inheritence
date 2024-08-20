abstract class Bank {
    void openAccount() {
        System.out.println("account is opened");
    }

    abstract void deposit(float amt);
}

class CityBank extends Bank {
    void deposit(float amt) {
        System.out.println("deposited :" + amt);
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        Bank b = new CityBank();
        b.deposit(23.5f);
        b.openAccount();

    }

}
