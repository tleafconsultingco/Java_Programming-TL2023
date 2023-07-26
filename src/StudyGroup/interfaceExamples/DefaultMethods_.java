package studyGroup.interfaceExamples;

public class DefaultMethods_ implements DefaultMethods{

    @Override
    public void method1() {
        System.out.println("class implementation m1");
    }

    @Override
    public void method2() {
        System.out.println("class implementation m2");
    }

    @Override
    public void method4() {
        System.out.println("class implementation m4");
    }

    public static void main(String[] args) {
        DefaultMethods_ obj1 = new DefaultMethods_();
        obj1.method1();
        obj1.method2();


    }


}
