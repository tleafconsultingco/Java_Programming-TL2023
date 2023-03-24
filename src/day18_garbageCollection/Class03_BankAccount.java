package day18_garbageCollection;

public class Class03_BankAccount {

    // 1. create instance variables
    public String accountHolder;

    public long accountNumber;
    public double balance;

    // 2. create instance methods

    // 2a. use constructor short cut and replace the Class name with "setInfo"
    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    // 2b. use the toString() method to display the account info
    public String toString() {
        return "Class03_BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    // 2c. use the instance method to create method
    public void checkBalance() { // void can be used bc we are just displaying the value
        System.out.println("Your available balance is: $" + balance);
    }

    // 2d. use instance method to create deposit method
    public void deposit(double amount) { // void can be used bc we are just displaying the value
        // parameter amount is required in order to know how much to increase balance by

        // 3a. create if statement to ensure the amount entered is valid
        if (amount < 1) { // checks to see if the value is valid
            System.err.println("Insufficient amount: $" + amount+". $"+amount+" was not added to your account.");
            return; // if the amount is makes the if statement true (<1, then it will not be added to the balance. the return method will discontinue the following line of codes in this method
        }

        System.out.println("Depositing $ " + amount + " to " + accountHolder);
        balance += amount; // balance will be increased by amount
        // 3. bug is that you can still add a negative amount, depositing amount needs to be at least $1
    }

    // 2e. use instance method to create withdraw method
    public void withdraw(double amount) { // void can be used bc we are just displaying the value
        // parameter amount is required in order to know how much to increase balance by

        // 5. create if statement to ensure the withdraw amount is not greater than balance
        if (amount > balance) {
            System.err.println("Insufficient withdraw amount.");
            return;
        }


        System.out.println("Withdrawing $ " + amount + " from " + accountHolder);
        balance -= amount; // balance will be increased by amount

        // 4. bug is that if the withdraw amount is greater than the balance, it should not be able to withdraw from the balance
    }


} // class close
/*
Create a custom class named BankAccount: Attributes:
1. accountHolder 2. accountNumber 3. balance
Actions:
1. setInfo(): sets the accountHolder and accountNumber attributes
2. toString(): displays the full account info
3. checkBalance():displays the available balance
4. deposit(amount): increases the balance by the specified amount
5. withdraw(amount): decreases the balance by the specified amount
 */