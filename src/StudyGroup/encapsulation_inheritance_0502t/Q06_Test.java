package studyGroup.encapsulation_inheritance_0502t;

public class Q06_Test {

    static String name = "John";
    String id = "123"; //!! this variable does not contain a static keyword (instance variable)

    public static void main(String[] args) {
        System.out.println(name);
            //John

        //System.out.println(id+1);
        // !! Does not work bc it is not a static variable

        //?? If we call the variable through an object, it will print
        Q06_Test obj = new Q06_Test();
        System.out.println(obj.id+1);
            //1231

        //- You can either make the variable static, or call it through an object.

    }

}
