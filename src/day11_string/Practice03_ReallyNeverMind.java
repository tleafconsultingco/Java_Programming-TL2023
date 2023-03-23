package day11_string;
import java.util.Scanner;

public class Practice03_ReallyNeverMind {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter a word: ");
        String word = input.nextLine();

        input.close();

        if(word.endsWith("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }





    }


}
/*
Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with
"ly", print "really???" , otherwise, print "never mind"
 */