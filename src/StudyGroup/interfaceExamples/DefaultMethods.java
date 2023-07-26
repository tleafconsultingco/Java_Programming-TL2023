package studyGroup.interfaceExamples;

public interface DefaultMethods {

     void method1();

     void method2();

     default void method3(){
          System.out.println("default from interface");
     }

     void method4();

}
