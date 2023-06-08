package studyGroup.encapsulation_inheritance_0502t;

public class Q07_Test {

    int score; //!! If we make this variable static, then the output will be 85

    static{
        //score = 75;
        // !! This cannot initialize an instance variable
    }

    public static void main(String[] args) {
        Q07_Test obj = new Q07_Test();
        obj.score = 85;

        System.out.println(obj.score);
    }

}
