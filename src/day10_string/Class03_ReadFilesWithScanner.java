package day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Class03_ReadFilesWithScanner {
    public static void main(String[] args) throws IOException { // exception is applied for the Scanner to work

        // Scanner scan = new Scanner(System.in); // this is for keyboard entry

        // reading a file using Scanner

        Scanner scan = new Scanner(Path.of("src/day10_string/Test01.txt")); // Scanner has compiler error, to avoid the error then add the exception

        // pull out data from the file using scan.next(), this will return the first word

        // System.out.println(scan.next()); // "Hello"

        // to run full line then you use nextLine()

        System.out.println(scan.nextLine()); // will run first line
        System.out.println(scan.nextLine()); // will run next line
        System.out.println(scan.nextLine());

        // read word by word by using next()
        // System.out.println(scan.next());
        // System.out.println(scan.next());
        // System.out.println(scan.next());


    }


}
