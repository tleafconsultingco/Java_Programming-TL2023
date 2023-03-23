package day12_customMethods;

public class Practice05_Method_ReplitSolution {

    public static void main(String[] args) {


        numberOfDays("feBrUary");

    }

    public static void numberOfDays(String month) {
        month = ("" + month.charAt(0)).toUpperCase() + month.substring(1).toLowerCase();

        String result = month + " has "; // why is this string not used in the method?

        switch (month) {
            case "February":
                month += " has "+28 + " days"; // added " has " +
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                month += 30 + " days";
                break;

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                month += 31 + " days";
                break;

            default:
                month = "Invalid month";
        }

        System.out.println(month);

    }



}
/*
Create a method that can print how many days a month has
    Ex:
        month("jUNe")
        output:
            June has 30 days

 */