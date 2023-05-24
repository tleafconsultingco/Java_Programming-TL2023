package day33_abstraction;

import day32_finalKeyword.personTask.Class10_Person;

import java.time.LocalDate;

public class Class01_CydeoDevStudent extends Class10_Person {

    //- Additional instance variables
    private final String id; //!! no setter methods bc final, need to initialize in the constructor
    private String batchName;
    private int batchNumber;

    //- Additional static variable
    public static final String programmingLanguage; //!! cannot be reassigned bc final

    //- Constructor
    public Class01_CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth); //?? RECALL this needs to be the first step
        //!! Add new conditions for the age
        //?? Age can only be set in the constructor (bc there is no setter method for it, it is final in the super class)
        if(getAge()<18){
            System.err.println("Cydeo Developer must be at least 18 years old.");
            System.exit(1); //!! prevents the object from being created based on the condition
        }//if
        this.id = id;
        setBatchName(batchName); //!! use Setter method instead
        setBatchNumber(batchNumber); //!! use Setter method instead
    }//constructor

    //- Static block
    static{
        programmingLanguage = "Java";
    }

    //- Getter and setter methods

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        if(batchName.equalsIgnoreCase("zero to hero")|| batchName.equalsIgnoreCase("Alumni dev")){
            this.batchName = batchName;
        }else{
            System.err.println("Invalid batch name: "+batchName+" \nNo such a batch at Cydeo");
            System.exit(1);
        }//if-else
    }//setBatchName

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber <= 0){
            System.err.println("Invalid batch number: "+batchNumber+"\n");
            System.exit(1);
        }//if
        this.batchNumber = batchNumber;
    }//setBatchNumber

    //- Override methods from super class

    @Override
    public void eat() {
        System.out.println(getName()+" is eating "+programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking "+programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" does not need to sleep");
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' + //!! these variables are private in the super class, so you need to use the getter methods
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }

    //!! RECALL that the breath method in the super class is FINAL and cannot be overridden
}//class
/*
1. Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables
 */