package day24_dateAndTime;

import java.time.LocalDate;

public class Class05_LocalDateIntro {
    public static void main(String[] args) {

        //? Display today's date

        LocalDate today = LocalDate.now();
        System.out.println("today = " + today); //today = 2023-04-11

        //? Display a birthday
        LocalDate birthDay = LocalDate.of(1999, 2, 28); //birthDay = 1999-02-28
        System.out.println("birthDay = " + birthDay); //birthDay = 1999-02-28

        System.out.println("------ LocalDate object methods: get ------");

        //? Use 2023-04-11 and get information of each component
        //!! getYear()
        System.out.println( today.getYear() ); //2023
        //!! getMonth()
        System.out.println(today.getMonth()); //APRIL
        //!! getMonthValue()
        System.out.println(today.getMonthValue()); //4
        //!! getDayOfWeek()
        System.out.println(today.getDayOfWeek()); //TUESDAY
        //!! getDayOfMonth()
        System.out.println(today.getDayOfMonth()); //11
        //!! getDayOfYear()
        System.out.println(today.getDayOfYear()); //101


        System.out.println("------ LocalDate object methods: plus ------");

        //? Use 2023-04-11 and add years, months, weeks, days
        today =  today.plusYears(1);
        System.out.println("today = " + today); //today = 2024-04-11

        //? Use graduationDate 2025-06-04 and add years, months, weeks, days
        LocalDate graduationDate = LocalDate.of(2025, 6, 4);
        System.out.println("graduationDate = " + graduationDate);
            //graduationDate = 2025-06-04

        //!! plusYears()
        graduationDate = graduationDate.plusYears(2);
        System.out.println("graduationDate + 2yr = " + graduationDate);
            //graduationDate + 2yr = 2027-06-04

        //!! plusMonths()
        graduationDate = graduationDate.plusMonths(7);
        System.out.println("graduationDate + 2yr + 7mo = " + graduationDate);
            //graduationDate + 2yr + 7mo = 2028-01-04

        //!! plusWeeks()
        graduationDate = graduationDate.plusWeeks(7);
        System.out.println("graduationDate + 2yr + 7mo + 7wk = " + graduationDate);
            //graduationDate + 2yr + 7mo + 7wk = 2028-02-22

        //!! plusDays()
        graduationDate = graduationDate.plusDays(100);
        System.out.println("graduationDate + 2yr + 7mo + 7wk + 100dy = " + graduationDate);
            //graduationDate + 2yr + 7mo + 7wk + 100dy = 2028-06-01


        System.out.println("------ LocalDate object methods: minus (same as plus) ------");

        LocalDate yourBirthDay = LocalDate.of(1972, 12, 8);
        System.out.println("yourBirthDay = " + yourBirthDay);
            //yourBirthDay = 1972-12-08
        
        //? Find Bday of brother born 2 years and 3 months before 1972-12-08
        LocalDate yourBrotherBirthDay = yourBirthDay.minusYears(2).minusMonths(3);
        System.out.println("yourBrotherBirthDay = " + yourBrotherBirthDay);
            //yourBrotherBirthDay = 1970-09-08

        System.out.println("------ LocalDate object methods: isEqual() ------");

        //? Evaluate if the birthdays are equal
        LocalDate birthday1 = LocalDate.of(1994, 7, 7);
        LocalDate birthday2 = LocalDate.of(1994, 7, 7);

        boolean equalBday = birthday1.isEqual(birthday2);
        System.out.println("equalBday = " + equalBday); //true


        System.out.println("------ LocalDate object methods: isBefore(), isAfter() ------");

        //? Is grad_date the same as today's date?
        LocalDate grad_date = LocalDate.of(2023, 1, 1);

        //? Is grad_date before/after today's date?
        //!! isBefore()
        System.out.println(  grad_date.isBefore(  LocalDate.of(2022, 12, 31) )); //false
        //!! isAfter()
        System.out.println(  grad_date.isAfter(  LocalDate.of(2022, 12, 31) )); //true

        System.out.println("------ LocalDate object methods: isLeapYear() ------");

        //? Is this date in a leap year?
        //!! isLeapYear()
        System.out.println(  LocalDate.of(2023, 4, 11).isLeapYear()  );
            //false

        

    }//main
}//class
