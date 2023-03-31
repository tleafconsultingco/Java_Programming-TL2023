package day20_forEach;

public class Class06_ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        //! 1. Using For loop
        for (int i = 0; i < numbers.length; i++) {
            //!! this i represents the index number of the loop
            //!! by using this i I can get each element at every index number
            System.out.println(numbers[i]);
                // 10
                // 20
                // 30
                // 40
                // 50
        }

        //! 2. Use For-Each loop
        for (int each:numbers){
            System.out.println(each);
                // 10
                // 20
                // 30
                // 40
                // 50
        }





    } // main close
} // class close
