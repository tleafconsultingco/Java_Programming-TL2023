package day31_inheritance.methodOverriding_animal;

public class Class13_Lion extends Class10_Animal{

    private boolean isAfricanLion;

    public Class13_Lion(String name, String breed, String size, String color, char gender, int age, boolean isAfricanLion) {
        super(name, breed, size, color, gender, age);
        setAfricanLion(isAfricanLion); //!! include additional variable from this sub class
    }//constructor

    public boolean isAfricanLion(){
        return isAfricanLion();
    }//isAfricanLion

    public void setAfricanLion(boolean africanLion){
        isAfricanLion = africanLion;
    }//setAfricanLion

    @Override
    public void eat(){
        System.out.println("Lion "+getName()+" is eating deer");
    }//eat

    public void roar(){
        System.out.println("Lion "+getName()+" is roaring");
    }//roar

    //! Need to override toString since we added an additional variable in this sub class
    @Override
    public String toString() {
        return  super.toString().replace("}", "") + //!! Replaces the last line of the toString method from the parent class to include an additional variable that needs to be printed
                ", African lion='" + isAfricanLion + '\'' +
                '}';
    }//toString




}//subclass
