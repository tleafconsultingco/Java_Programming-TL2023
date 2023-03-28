package day20_forEach;

public class Practice04_UniqueElements {
    public static void main(String[] args) {

        int[] array1 = {1,1,1,1,3,4,4,4,5,6,7,7,7,7,7,7,7,8,8,9,10,10};

        // 1. Use For-Each loop
        for (int element : array1) {
            // 2. Initialize a variable for counting the frequency
            int count = 0;
            // 3. Use another For-Each loop to count frequency
            for (int each : array1) {
                // 4. Create if statement to increase the count for the element if it is repeated
                if (each==element){
                    count++;
                }//if close
            }//inner for-each loop close
            // 5. Use If statement to print only the elements with frequency 1.
            if (count==1){
                System.out.println(element);
                    //3
                    //5
                    //6
                    //9
            }//if close

        }//outer for-each loop close


    }//main close
}//class close
/*
Write a program that can display the unique elements of an array MUST use for each loops

 */