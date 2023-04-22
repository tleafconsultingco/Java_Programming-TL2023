package week02_day04_06;

public class Class04_Pizza {

    public static void main(String[]args){

        String type = "cheese";
        int slices = 2;
        int people = 5;

        String summary = "We order a " + type + " pizza with " + slices + " slices. " + people + " people ate " + (slices/people) + " slices each, so there was " + (slices % people) + " slices left.";
        System.out.println(summary);


    }
}
