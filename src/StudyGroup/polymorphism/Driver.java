package studyGroup.polymorphism;

public class Driver extends Employee implements TimeOff{

    public Driver(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }

    @Override
    public void work(){
        System.out.println(getName()+" is driving");
    }

    @Override
    public void vacation() {
        System.out.println(getName()+" vacations every year");
    }
}
