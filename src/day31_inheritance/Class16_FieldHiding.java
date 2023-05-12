package day31_inheritance;

//!! create second class with default access modifier
class A{

    public int a = 100;

}//class

//!! A becomes the parent class
public class Class16_FieldHiding {
    public int a = 300;

    public static void main(String[] args) {
        System.out.println(new Class16_FieldHiding().a);
            //300
        //!! The parent class hides the variable when the child class has a variable with the same name as in the parent class (implicitly)



    }//main
}//class


