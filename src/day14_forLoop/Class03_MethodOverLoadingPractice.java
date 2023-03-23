package day14_forLoop;

public class Class03_MethodOverLoadingPractice {

    public static void main(String[] args) {
        System.out.println(   sum(10, 20)   ); // 2 number sum method will be executed bc of number of arguments passed
        System.out.println( sum(10, 20, 30) );
        System.out.println(  sum(10, 20, 30, 40));
        System.out.println(  sum(1.5, 2.5)  );
        System.out.println( sum(2.5, 3.5,  4.5) );
        System.out.println( sum(1.5, 10.5, 20.5, 30.5 ));
        System.out.println( sum(10, 20.5)  );

        System.out.println(sum(2,4,5,6));


    }
    public static int sum(int n1, int n2){
        return n1+n2;
    }

    public static int sum(int n1, int n2, int n3){
        return sum(n1, n2)+n3;
    }

    public static int sum(int n1, int n2, int n3, int n4){
        return sum(n1,n2,n3)+n4;
    }

    public static double sum(double n1, double n2){
        return n1+n2;
    }

    public static double sum(double n1, double n2, double n3){
        return sum(n1,n2)+n3;
    }
    public static double sum(double n1, double n2, double n3, double n4){
        return sum(n1, n2)+sum(n3, n4);

    }



}
