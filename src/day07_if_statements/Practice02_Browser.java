package day07_if_statements;

public class Practice02_Browser {
    public static void main(String[] args) {

        String browser = "chrome";

        if(browser == "chrome" || browser == "firefox" || browser == "opera" || browser == "safari" || browser == "edge"){
                System.out.println(browser+" browser is selected");
        }else{
            System.out.println("Invalid browser name");
        }




    }
}
/*
Create a class called Browser. Write a program that can display the name of selected browser
1. declare a String variable named browserName
2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
3. if the browser name does not match with the valid browser names, out put should be:
Invalid Browser Name
Ex:
String browser = "chrome";
Output:
Chrome Browser is selected
Note: MUST use nested if

 */