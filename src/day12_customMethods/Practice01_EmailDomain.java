package day12_customMethods;

public class Practice01_EmailDomain {

    public static void main(String[] args) {

        emailDomain("Cydeo@yahoo.com");

    }

    public static void emailDomain (String email){

        String emailDomain = email.substring(email.indexOf('@')+1,email.indexOf('.'));

        System.out.println(emailDomain);


    }

}
/*
Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */