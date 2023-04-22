package day25_constructors;

import java.time.LocalDateTime;

public class Class02_LocalDateTimeIntro {
    public static void main(String[] args) {

        //? Get local date and time
        LocalDateTime starts = LocalDateTime.now();
        System.out.println("starts = " + starts);
            //starts = 2023-04-12T15:07:54.757178

        //? Specify a specific date and time
        LocalDateTime ends = LocalDateTime.of(2023, 5, 18, 11, 0);
        System.out.println("ends = " + ends);
            //ends = 2023-05-18T11:00

        //? Based on variable starts that shows the local date and time
        System.out.println(starts.getDayOfWeek()); //WEDNESDAY
        System.out.println(starts.getHour()); //15


    }//main
}//class close
