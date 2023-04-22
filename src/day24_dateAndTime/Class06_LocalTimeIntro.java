package day24_dateAndTime;

import java.time.LocalTime;

public class Class06_LocalTimeIntro {
    public static void main(String[] args) {

        LocalTime starting_time = LocalTime.of(10, 30);
        System.out.println("starting_time = " + starting_time); //starting_time = 10:30

        LocalTime right_now = LocalTime.now();
        System.out.println("right_now = " + right_now); //right_now = 12:26:47.040943

        System.out.println("-- Local time using plus...() --");

        LocalTime time1 = LocalTime.of(23, 59, 59);
        System.out.println("time1 = " + time1); //time1 = 23:59:59

        time1 = time1.plusHours(1);
        System.out.println("time1 + 1hr = " + time1); //time1 + 1hr = 00:59:59

        time1 = time1.plusMinutes(45);
        System.out.println("time1 + 1hr + 45 min = " + time1); //time1 + 1hr = 00:59:59


    }//main
}//class
