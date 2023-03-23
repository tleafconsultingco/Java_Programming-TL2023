package day12_customMethods;

public class Practice05_Method {
    public static void main(String[] args) {
        daysInMonth("January");

    }
//NOT CORRECT
    public static void daysInMonth(String month) {

        month = (""+ month.charAt(0)).toUpperCase() + month.substring(1);

        String result = month + " has";

        switch (month) {
            case "February":
                month += 28 +" days";
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                month += 30 +" days";
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                month += 31 +" days";
                break;
            default:
                month = "Invalid Entry";
                break;

        }

        System.out.println(result);


    }


}
/*
Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */