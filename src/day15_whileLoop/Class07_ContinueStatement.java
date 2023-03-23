package day15_whileLoop;

public class Class07_ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) { // 1, 2, 3, 4, 5
            // I want statement 4 to be skipped

            if (i == 4) { // this will skip 4 and then continue the following body of the loop
                continue;
            }

            System.out.println(i);

        }


        System.out.println();
        System.out.println("-------");

        for (int i = 10; i < 21; i++) { // 11 iterations

            if (i % 2 == 0) { // even numbers will be skipped
                continue;
            }
            System.out.println(i); // odd numbers will be printed

        }

        System.out.println();
        System.out.println("-----");

        // using multiple continue statements in a loop
        for (char i = 'A'; i <= 'G'; i++) {
            // skip 2nd and 5th conditions

            // if(i=='B' || i=='E') // could write it this way
            if (i == 'B') {
                continue;
            }
            if (i == 'E') {
                continue;
            }
            System.out.println(i);

        }

        System.out.println();
        System.out.println("------");

        for (int i = 0; i <=10 ; i++) {
            System.out.println("Hello World");
        }



    }
}
