package utilities;

public class TestCode {
    public static void main(String[] args) {

        int x = 69, y = 89, z = 79;

        int largestNumber = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("The largest number is: " + largestNumber);
            //The largest number is: 89


    }//main close
}//class close
