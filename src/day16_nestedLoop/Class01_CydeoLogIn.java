package day16_nestedLoop;

import java.util.Scanner;

public class Class01_CydeoLogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password");
        String p = input.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){ // if credentials are correct
            System.out.println("Logged in");
        }else{ // if credentials are incorrect
            // you have 3 attempts in this loop
            for (int i = 0; i < 3; i++) { // i: 0, 1, 2
                // give hard warning before last attempt

                if(i!=2){
                    System.err.println("Incorrect username or password, please re-enter.");
                }else {
                    System.err.println("This is your last attempt. Please re-enter.");
                }

                System.out.println("Enter your username:");
                u = input.next();
                System.out.println("Enter your password");
                p = input.next();
                if(u.equals("Cydeo") && p.equals("WoodenSpoon")){ // if the user enters correct credentials (after having failed)
                    System.out.println("Logged in");
                    break; // exits loop once this condition is true within the loop (3 attempts)
                }
            }
            if(! (u.equals("Cydeo") && p.equals("WoodenSpoon"))){ // if valid credentials are not provided after the loop (3 attempts), then...
                System.err.println("Your account is now locked.");
            }

        }
        input.close();
    }


    // create method
    public static void cydeoLogIn(String username, String password){
        if(username.equals("Cydeo")&& password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{
            System.out.println("Invalid credentials");
        }

    }



}
/*
Create a class named CydeoLogIn. you are writing a code for
the log-in function of the Cydeo Application, assume that your
credentials are:
                    username: Cydeo
                    password: WoodenSpoon
        Ask the user to enter their credentials.
                If credentials are matched, your program should print
"Logged in."
allow
credentials
If the credentials are not matched, the program should
the user to have three attempts to enter correct
                if all three attempts are failed, then print "Your
account is lucked."
 */