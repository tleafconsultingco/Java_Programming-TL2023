package day15_whileLoop;

public class Class06_BreakStatement {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) { // runs loop from 0-9

            // before printing 6, we decide to break loop
            if(i == 6){ // if i=6 then...
                break; // ...exits the loop
            }

            System.out.println(i);

        }

        System.out.println();
        System.out.println("-------");

        for (char i = 'A'; i < 'Z'; i++) {

            System.out.println(i);

            if(i=='J'){
                break;
            }
        }

        System.out.println();
        System.out.println("------");

        for(;;){
            System.out.println("Hello");
            break;
        }


    }
}
