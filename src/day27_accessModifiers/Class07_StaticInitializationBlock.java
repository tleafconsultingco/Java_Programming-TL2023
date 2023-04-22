package day27_accessModifiers;

public class Class07_StaticInitializationBlock {

    //-- Static variables
    public static int a  ;
    public static double b ;
    public static String c ;

    //  public static ExcelSheet sheet;
        // Inorder to set the variable sheet, you need to go through steps (read file, get file, read sheet)

    //!! Use a static block to provide code fragments
    static{
        a = 100;
        b = 20.5;
        c = "Java";

        //!! Since variables are within the static block, they will be set first
    }


    //@@ You shouldn't use constructors to initialize static variables
    /*
    public StaticInitializationBlock(){
        a = 100;
        b = 20.5;
        c = "Java";
    }
*/


    //@@ You shouldn't use any methods to initialize static variables
    /*
    public static void main(String[] args) {
        a = 100;
        b = 20.5;
        c = "Java";
    }
*/

}//class
