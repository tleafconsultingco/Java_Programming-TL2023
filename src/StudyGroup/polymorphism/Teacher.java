package studyGroup.polymorphism;

public class Teacher extends Employee implements TimeOff{

    public Teacher(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }

    @Override
    public void vacation() {
        System.out.println(getName()+" has summer vacation");
    }

    @Override
    public void paidTimeOff() {
        System.out.println(getName()+" does not have paid time off");
    }
}
