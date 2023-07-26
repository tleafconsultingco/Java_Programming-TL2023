package studyGroup.polymorphism;

public interface TimeOff {

    void vacation();

    default void paidTimeOff(){
        System.out.println("has paid time off");
    }

}
