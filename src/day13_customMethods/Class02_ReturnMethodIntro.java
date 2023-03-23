package day13_customMethods;

public class Class02_ReturnMethodIntro {
    public static void main(String[] args) {

        int total = sum(2,18);
        System.out.println(total);
        int t = square(2);
        System.out.println(t);
        int t2 = cubed(10);
        System.out.println(t2);


    }

    public static int sum(int num1, int num2) { // using "int" return type instead of "void" bc we need a return value

        int result;

        result = num1 + num2;
        return result;

    }


    public static int square(int num) {

        int square = num * num;
        return square;


    }


    public static int cubed(int num){
        int cubed = square(num)*num;
        return cubed;


    }


}
