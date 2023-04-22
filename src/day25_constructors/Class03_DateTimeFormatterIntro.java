package day25_constructors;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Class03_DateTimeFormatterIntro {
    public static void main(String[] args) {

        /* PATTERN
        y = 4 digit year
        yy = 2 digit year
        M = months number
        MM = 2 digit months number (0 included for numbers 0-9)
        MMM = month abbr (Jan, Feb...)
        MMMM = month name (January, February...)
        d = day number
        dd = 2 digit day number (0 included for numbers 0-9)
        E = day abbr (Mon, Tue...)
        EEEE = day name (Monday, Tuesday...)

         */

        //? Patterns
        DateTimeFormatter patterns = DateTimeFormatter.ofPattern("EEEE y/M/d");
        LocalDate apr12 = LocalDate.now();
        System.out.println("apr12 = " + apr12);



        //? Formatting the date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/y EEEE");
        LocalDate today = LocalDate.now();
        System.out.println("today = "+today.format(df)); //today = Apr/12/2023 Wednesday

        LocalDate date1 = LocalDate.of(2022, 7, 1);
        System.out.println("date1 = "+ date1.format(df));  //date1 = Jul/01/2022 Friday


        //? Formatting the time
        DateTimeFormatter tf  = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time1 = LocalTime.of(17, 30);
        System.out.println("time 1 = "+time1.format(tf) ); //time 1 = 05:30 PM

        //? Formatting the date and time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");
        LocalDateTime starts = LocalDateTime.now();
        System.out.println("starts = "+starts.format(dtf)); //starts = Wednesday, Apr/12/2023  03:31 PM


        //? Tuesday, 1:00 pm, Nov/24/2020
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, h:mm a MMM/dd/y");
        LocalDateTime task = LocalDateTime.of(2020,11,24,13,0);
        System.out.println("task = " + task.format(dtf2)); //task = Tuesday, 1:00 PM Nov/24/2020



    }//main
}//class
