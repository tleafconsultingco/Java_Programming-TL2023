package day27_accessModifiers;

public class Class12_InstanceInitializationBlock {


    //!! Instance variables
        public String name;
        public int age;

    //!! If I assign a value for the instance variables, they will be executed for every object (acts as if they are static variables)
    /*
    {
        name = "James";
        age = 20;
    }
*/

    //!! Constructor
        public Class12_InstanceInitializationBlock(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public static void main(String[] args) {

        /*
        Class12_InstanceInitializationBlock obj1 = new Class12_InstanceInitializationBlock();
        Class12_InstanceInitializationBlock obj2 = new Class12_InstanceInitializationBlock();
        //!! James is the default name bc it was initialized in the instance block
        System.out.println(obj1.name); //James
        System.out.println(obj2.name); //James
         */

            Class12_InstanceInitializationBlock obj1 = new Class12_InstanceInitializationBlock("James", 25);

            Class12_InstanceInitializationBlock obj2 = new Class12_InstanceInitializationBlock("Aaron", 28);


            System.out.println(obj1.name); //James
            System.out.println(obj2.name); //Aaron

        }
}//class
