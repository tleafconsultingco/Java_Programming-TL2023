package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Class09_President extends Class06_Person {

    //- Private instance variables
    private LocalDate electedDate;

    //- Constructor
    public Class09_President(String name, char gender, LocalDate DOB, LocalDate electedDate) {
        super(name, gender, DOB);
        setElectedDate(electedDate);
    }//constructor

    //- Getter and setter methods
    public LocalDate getElectedDate() {
        return electedDate;
    }//getElectedDate

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }//setElectedDate

    //- Methods
    public void lie(){
        System.out.println(getName()+" is lying");
    }//lie

}//subclass
