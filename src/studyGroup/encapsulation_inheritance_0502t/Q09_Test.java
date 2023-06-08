package studyGroup.encapsulation_inheritance_0502t;

public class Q09_Test {
    static String studentName = "Mike";

    static{
       studentName = "Jordan";
    }

    public static void main(String[] args) {
        studentName = "Jean";
        System.out.println(studentName);
            //Jean
    }

}
