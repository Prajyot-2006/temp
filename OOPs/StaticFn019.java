class BankAccount {
    String branchLocation;
    static double minBalance = 1000;   // static variable → one common copy shared by all BankAccount objects
    static void showMinBalance() { // static method → belongs to the class, so it can be called without an object
        System.out.println("Minimum Balance: " + minBalance);
    }
}
// NOTE : Static elements can be printed without creating an object
public class StaticFn019 {
    public static void main (String[] args) {
        BankAccount b1 = new BankAccount();
        // We can call a static method using an object, but it is better to call it using the class name.
        b1.showMinBalance(); 
        // calling it using the class name
        BankAccount.showMinBalance();
        BankAccount b2 = new BankAccount();
        b2.minBalance = 2000;
        b1.showMinBalance();
        
    }
}