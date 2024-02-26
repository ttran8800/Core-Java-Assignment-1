

abstract class Bank {
    public abstract double getBalance();

}

//subclass of bank, constructor receives balance and prints it at the same time of Instantiation
class BankA extends Bank {
    private double balance = 100;

    BankA() {
        System.out.println("This bank has a balance of: " + getBalance());
    }
    @Override
    public double getBalance() {
        return balance;
    }
}

//subclass of bank, constructor receives balance and prints it at the same time of Instantiation

class BankB extends Bank {
    private double balance = 150;

    BankB() {
        System.out.println("This bank has a balance of: " + getBalance());
    }
    @Override
    public double getBalance() {
        return balance;
    }
}

//subclass of bank, constructor receives balance and prints it at the same time of Instantiation

class BankC extends Bank {
    private double balance = 200;

    BankC() {
        System.out.println("This bank has a balance of: " + getBalance());
    }
    @Override
    public double getBalance() {
        return balance;
    }
}

public class week3test5 {

    public static void main(String[] args) {

        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

    }

}
