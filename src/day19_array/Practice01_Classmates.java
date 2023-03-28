package day19_array;

public class Practice01_Classmates {
    public static void main(String[] args) {

        String[] classmates = {"Hermoine Granger","Harry Potter","Ronald Weasley","Draco Malfoy","Cedric Diggory","Lord Voldemort","Albus Dumbledore","Severus Snape","Rubeus Hagrid","Minerva McGonagall"};
        
        
        // 1. Use For loop to go through each element
        for (int i = 0; i < classmates.length; i++) {
            // 2. Create new string variable to hold initials
            String initials = classmates[i].charAt(0)+"."+classmates[i].charAt(classmates[i].indexOf(" ")+1);
            // 2a.            element: character at 0  .  element: character at (element: index at space plus 1 to get the next character)
            // 3. Print in the loop
            System.out.println("Initials: "+initials);
                //Initials: H.G
                //Initials: H.P
                //Initials: R.W
                //Initials: D.M
                //Initials: C.D
                //Initials: L.V
                //Initials: A.D
                //Initials: S.S
                //Initials: R.H
                //Initials: M.M
        }





    }//main close
}//class close
/*
create an array named classmates, and store 10 of your classmates' full names print the initials of each classmates in separate lines
 */