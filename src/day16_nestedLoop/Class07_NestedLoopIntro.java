package day16_nestedLoop;

public class Class07_NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon "+i); // repeated 5 times
        }

        // if you need to repeat the loop, you could copy and paste the loop...or make a nested loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon "+i); // repeated 5 times
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon "+i); // repeated 5 times
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon "+i); // repeated 5 times
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon "+i); // repeated 5 times
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon "+i); // repeated 5 times
        }
        System.out.println("-----NESTED LOOP");

        for (int i = 0; i < 5; i++) { // outer loop. When it runs 1 time, the inner loop runs. The outer loop will run 5 times.
            for (int j = 0; j < 5; j++) { // inner loop. Will run 5 times.
                System.out.println("Wooden Spoon "+j); // results in this being printed 25 times (5 outer x 5 inner).
            }
        }






    }
}
