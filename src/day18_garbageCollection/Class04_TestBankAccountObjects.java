package day18_garbageCollection;

public class Class04_TestBankAccountObjects {
    public static void main(String[] args) {

        // 1. create new object
        Class03_BankAccount obj1 = new Class03_BankAccount();
        obj1.setInfo("JJ", 123456789);

        System.out.println(obj1);

        // how can we set the balance for this account? by adding a deposit

        // 2.
        obj1.deposit(1000);
        obj1.checkBalance();

        obj1.withdraw(700);
        obj1.checkBalance();

        obj1.deposit(-1000);
        obj1.checkBalance();
        obj1.deposit(2000);
        obj1.checkBalance();

        obj1.withdraw(5000);
        obj1.checkBalance();


        System.out.println("-------------------");

        // 3. create bank account objects

        Class03_BankAccount acct1 = new Class03_BankAccount();

        Class03_BankAccount acct2 = new Class03_BankAccount();

        acct1.setInfo("ABC", 789456);
        acct2.setInfo("DEF", 312546);

        acct1.deposit(5000); // who has this 5000 deposited, both? no. just acct1
        acct2.deposit(10000); // who has this 10000 deposited, both? no. just acct2
        System.out.println(acct1); // Depositing $ 5000.0 to ABC
        System.out.println(acct2); // Depositing $ 10000.0 to DEF

        acct1.withdraw(1000);
        acct2.withdraw(100);

        System.out.println(acct1);
        System.out.println(acct2);


    } // main close


} // class close
