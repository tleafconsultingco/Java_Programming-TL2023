package day06_if_statements;

public class Class04_OperatorPrecedence {
    public static void main(String[] args){

        System.out.println(5+2*3); // 11
        System.out.println((5+2)*3); // 21

        System.out.println(7+3-2/2); // 9

        System.out.println( -5 +3); // -2

        System.out.println(10>9 == 8<7); // false
        //                  t   ==  f ==> false

        System.out.println(10>9 == 8<7 && "Java" == "Python" || 'a' == 'A'); // false
        //                  t   ==  f  &&         f          f
        //                      f      &&         f          ||      f ==> false
        //                             f                     f ==> false

        System.out.println( 100 >= 20 && 40 * 2 > 60 ); //
        //                 (100>=20) && ((40*2) > 60)
        //                     t     && (80 > 60)
        //                     t     &&     t ==> t

        int a = 20;
        a += 10+2*3;
        // 10+5 = 16
        // a == 20+15=36





    }//main close
}//class close