package day19_array;

public class Practice02_ClassmatesReverse {
    public static void main(String[] args) {

        String[] classmates = {"Hermoine Granger","Harry Potter","Ronald Weasley","Draco Malfoy","Cedric Diggory","Lord Voldemort","Albus Dumbledore","Severus Snape","Rubeus Hagrid","Minerva McGonagall"};

        /*
        STEPS
        1. Use For loop to create a string of each element (their name)
        2. Nest another For loop to create a reverse string of their name
         */

        // 1.
        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i]; // 1a. this will make each element a string
            String reverse = ""; // 1b. create to use in next loop
            // 2. Use the array For loop reverse shortcut
            for (int j = name.length() - 1; j >= 0; j--) { // 2a. use j as variable
                // 2b. The loop will start from the last element (length-1) and decrement to the previous element until it reaches the first element
                reverse += name.charAt(j); // 2c. This adds each character of j at every index from the string name and adds it to the string reverse
            }//inner for loop close
            // 3. Print w/in the outer loop
            System.out.println("Name in reverse: "+reverse);
                //Name in reverse: regnarG eniomreH
                //Name in reverse: rettoP yrraH
                //Name in reverse: yelsaeW dlanoR
                //Name in reverse: yoflaM ocarD
                //Name in reverse: yroggiD cirdeC
                //Name in reverse: tromedloV droL
                //Name in reverse: erodelbmuD sublA
                //Name in reverse: epanS sureveS
                //Name in reverse: dirgaH suebuR
                //Name in reverse: llaganoGcM avreniM
        }//outer for loop close




    }//main close
}//class close
/*
create string array, and store the names of your class mates (10) reverse each students names and print them in separate lines
ex:
arr = {java, python, c#}
output: avaJ
nohtyp #c
 */