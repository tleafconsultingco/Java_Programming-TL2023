package week02;

public class Class02_CastingExample {
    public static void main(String[]args){

        int i = 30;
        long l = i;

        long l2 = 100; // 100 is int, int is smaller than long, so no problems, it will automatically go to long for the variable
        byte b2 = (byte)l2;

        double d3 = 15.99;
        int i3 = (int)d3;
        System.out.println(i3);

        int i4 = 1_000_000;
        byte b4 = (byte)i4; // 1_000_000 is out of the range of byte, there is data loss
        System.out.println(b4); // the result is based on some calculation


        // float f5 = 10.23; // can't store a double to float
        float f5 = 10.23f; // now it can run the data as a float
        // float f5 = (float)10.23; // can also run the same output, but not the best version
        int i5 = (int)f5;
        System.out.println((double)i5); // you are taking i5 to int (losing data), and then putting it back to double, answer will be 10.0 not 10.23

        char letter = 'A';
        System.out.println((int)letter); // 65 bc char values have numerical equivalents

        char letter2 = 66;
        System.out.println(letter2); // equals 'B'

        double d6 = 12.99;
        long l7 = (long)d6;
        System.out.println(l7);


    }





}
