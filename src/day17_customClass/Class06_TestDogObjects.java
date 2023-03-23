package day17_customClass;

public class Class06_TestDogObjects {
    public static void main(String[] args) {

        // create object from class by using "new" keyword and constructor
        Class05_Dog dog1 = new Class05_Dog();
        //                 this is a new dog object
        // make this reusable by storing into container (variable)

        // access the instances using the dot operator
        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.size = "Large";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.color = "Black";

        dog1.eat(); // Max is eating dog food
        // if you call this method without assigning the instance variable then you will return "null"

        System.out.println(dog1); // compiler is looking for toString(), if you don't have it in your instance method then you will get hashcode


        // create another dog object by manually calling all the instance variables
        Class05_Dog dog2 = new Class05_Dog();
        dog2.name = "Loki";
        dog2.breed = "Chow Chow";
        dog2.size = "Medium";
        dog2.gender = 'M';
        dog2.age = 2;
        dog2.color = "Brown";

        System.out.println(dog2);

        // create another dog object by calling the custom method that holds these parameters
        Class05_Dog dog3 = new Class05_Dog();
        dog3.setInfo("Bella","Golden Retriever", "Small", 'F',5,"Blonde");

        System.out.println(dog3);

        // create another dog object by calling the custom method
        Class05_Dog dog4 = new Class05_Dog();
        dog4.setInfo("JJ","Pitt","Medium",'F',8,"Black");

        System.out.println(dog4);


        // Call an instance method
        dog3.eat(); // this will only show dog3
        dog2.drinking(); // this will only show dog2





    } // close main

}
