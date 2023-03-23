package day04_primitive_type_castings_concantenation;

public class Task01_FullName {
    public static void main(String[] args) {

        String firstName = "Daniel",
                lastName = "Jefferson";

        System.out.println(firstName + " " + lastName);

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        System.out.println("Your full name is " + fullName);
    }
}
