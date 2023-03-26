package day19_array;

import java.util.Arrays;

public class Class04_ArrayLiterals {
    public static void main(String[] args) {

        // 1. Create new array for elements that are unknown
        int[] numbers = new int[5];

        // 2. Create new array for elements that are known
        int[] nums = {10,20,30,40,50};

        System.out.println(numbers.length);
            // 5
        System.out.println(nums.length);
            // 5

        System.out.println("numbers = "+ Arrays.toString(numbers));
            // numbers = [0, 0, 0, 0, 0]
        System.out.println("nums = "+ Arrays.toString(nums));
            // nums = [10, 20, 30, 40, 50]


        System.out.println("-----days-----");

        // 3. Create an array of the days
        // 3a. Use string literal since we know the values
        String[] daysArrayLiteral = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        // index:                      0     1     2     3     4     5     6
        // element:                    1     2     3     4     5     6     7

        // 3b. Use new keyword to create elements
        String[] daysArrayNewKeyword = new String[7];
        // 3b1. Now we have to assign values to the elements
        daysArrayNewKeyword[0] = "Mon";
        daysArrayNewKeyword[1] = "Tue";
        daysArrayNewKeyword[2] = "Wed";
        daysArrayNewKeyword[3] = "Thu";
        daysArrayNewKeyword[4] = "Fri";
        daysArrayNewKeyword[5] = "Sat";
        daysArrayNewKeyword[6] = "Sun";

        // 4. Print
        System.out.println("Days using array literal: "+Arrays.toString(daysArrayLiteral));
            // Days using array literal: [Mon, Tue, Wed, Thu, Fri, Sat, Sun]
        System.out.println("Days using new keyword: "+Arrays.toString(daysArrayNewKeyword));
            // Days using new keyword: [Mon, Tue, Wed, Thu, Fri, Sat, Sun]

        // 5. If user passes n=1, how do I print the element value?
        int n = 1;
        // 5a. Print the value of the element
        System.out.println(daysArrayLiteral[n-1]); // This will print the first index, which is at 0 and has the value "Mon"

        System.out.println("-----months----");
        // 6. Create a new array for months
        // best to use array literal
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("months are: " +Arrays.toString(months));
            // months are: [Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec]

            // 6a. What's happening in the background?
                /*
                month = new String[12];
                month [0] = "Jan"
                ...
                month [11] = "Dec"
                 */

        // 7. Print month array in reverse
        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
            /*
            Dec
            Nov
            Oct
            Sep
            Aug
            Jul
            Jun
            May
            Apr
            Mar
            Feb
            Jan
             */
        }


        System.out.println("-----store numbers 1-100-------");
        // There are 100 elements, it would not be wise to use array literal or assign all elements through new keyword by itself
        // Instead, use a loop!

        int[] num1To100 = new int[100];
        for (int i = 0; i < num1To100.length; i++) {
            num1To100[i] = i+1;
        }
        System.out.println("num1To100 = " +Arrays.toString(num1To100));



    } // main close
} // class close
