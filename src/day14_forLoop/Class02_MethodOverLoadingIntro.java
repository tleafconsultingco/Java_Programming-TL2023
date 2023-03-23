package day14_forLoop;

public class Class02_MethodOverLoadingIntro {


    public static void methodA(){

    }

    public static void methodA(int a){

    }

    // public static void methodA(int b){ // compiler error bc there is already a methodA with int parameter

    public static void methodA(double b){

    }

    public static void methodA(int a, int b){


    }

}
