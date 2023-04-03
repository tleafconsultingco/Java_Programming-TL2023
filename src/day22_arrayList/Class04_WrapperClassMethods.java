package day22_arrayList;

public class Class04_WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20"; //!! Treated as a String, not as an integer

        System.out.println(str+1); // since str is a string it will return concatenated value, not addition operator value
            //201
        //? How do I get this value to be treated as an integer?
            //?? Convert to primitive int using parse()

        Integer num1 = Integer.parseInt(str); //!! unboxing
        //!! You can just directly assign the wrapper class with parse() to the primitive data type
        int num = Integer.parseInt(str); //!! returns primitive int
        System.out.println(num+1); // returns integer
            //21
        //!! This is not best practice bc only arrays support primitive data types, you should keep this store this value as an integer wrapper class

        //? Which wrapper class should you use to convert this string to?
            //?? Use valueOf()
        Integer num2 = Integer.valueOf(str); //!! Returns int wrapper class
        System.out.println(num2);
            //20

        System.out.println("------- Double -------");

        String s = "20.5";
        //! I want to take this string and convert to a decimal number
            //!! Best to use a double wrapper class

        double num3 = Double.parseDouble(s);
        Double num4 = Double.valueOf(s);

        System.out.println("num3 = "+num3);
        System.out.println("num4 = "+num4);
            //num3 = 20.5
            //num4 = 20.5

        System.out.println("----- Boolean -------");
        String x = "true";
        //!! if you use any other string besides true or false, it will return false

        boolean r1 = Boolean.parseBoolean(x);

        Boolean r2 = Boolean.valueOf(x);

        System.out.println("r1 = "+r1);
        System.out.println("r2 = "+r2);

        System.out.println("--------- char ---------");

        char ch = 'A';

        boolean isDigit =Character.isDigit(ch);
        System.out.println("isDigit = "+isDigit); //isDigit = false

        boolean isLetter = Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter); //isLetter = true
        
        boolean isLowerCaseLetter = Character.isLowerCase(ch);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter); //isLowerCaseLetter = false
        
        boolean isUpperCaseLetter = Character.isUpperCase(ch);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter); //isUpperCaseLetter = true
        
        boolean isSpecialChar = !Character.isLetterOrDigit(ch);
        System.out.println("isSpecialChar = " + isSpecialChar);
            //isSpecialChar = false


        System.out.println("------- char wrapper class practice --------");

        //- Extract digits and find sum

        String string = "a1b2c3d4e5";
        //! Find sum of all the digits and add to int variable sum
        //!! Assign sum to 0
        int sum = 0;

        //! 1. Get every character from string as a digit and convert to number
        //!! You could iterate at every index, and then use charAt() to get each character
        //!! For-Each loop is ideal, but can't be used on String since it is not a data structure
        //!! But you can create a data structure out from this string

        //? How to get every single character of the string as a char data structure?
        //?? From given string, you can use toCharArray(), then you can use For-Each loop
            // string.toCharArray().for
        for (char each : string.toCharArray()) {
            //! Use If statement to verify if the character from each is a digit
            if (Character.isDigit(each)){ //!! Use isDigit() method since you converted ???
                //!! Convert character to integer (digit)
                sum += Integer.parseInt(""+each);
                //!! Use parse(), but parse() only accepts String
                //!! Convert by concatenating to empty String
                //!! If character is a digit, you can convert it to a number
            }//If statement close
        }//For-each loop close

        System.out.println("sum = " + sum); //sum = 15



        //!! If true, then increase the sum by the






    }//main close
}//class close
