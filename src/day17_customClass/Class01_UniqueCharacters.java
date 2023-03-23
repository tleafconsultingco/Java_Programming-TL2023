package day17_customClass;

public class Class01_UniqueCharacters {
    public static void main(String[] args) {


        String str = "aabcccd";
        String unique = "";



        // create loop to check char at each index
        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i); // when loop is executed it will give us index at each new character
        // to find if a character is unique...
            // use indexOf() to see when a character first appears
            // use lastIndexOf() to see when a character last appears
            if(str.indexOf(each)==str.lastIndexOf(each)){
                unique += each;
            }

            // ^^ not the best approach for all tasks. Nested loop is best.
        }

        System.out.println(unique);




    }
}
/*
Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */