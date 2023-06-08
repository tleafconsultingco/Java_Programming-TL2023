package day28_encapsulation;

public class Class03_Student {

    //- Examples of private instance variables
    private String name;
    private int age;

    //- Getter instance method
    public String getName() {

        if(name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }//if close

        return name;
    }//getter instance

    //- Setter instance method
    public void setName(String name) {

        //!! Check if name has digits
        boolean hasDigit = false;

        //!! Will need to iterate each char to see if there's a digit
        for (char each : name.toCharArray()) {
            if(Character.isDigit(each)){
                hasDigit = true;
                break;
            }//if close
        }//for-each close

        if(hasDigit){ //!! if hasDigit is true
            System.err.println("Invalid name: "+name);
            System.exit(1);
        }//if close

        this.name = name;
    }//setter instance


    public int getAge(){ //!! READ ONLY

        if(age == 0){
            System.err.println("Age has not been set");
            System.exit(1);
        }//if close

        return age;
    }//getAge

    //- Initializing/setting the age
    public void setAge(int age){ //!! WRITE ONLY
        //-- Conditions for resetting age
        if( age < 1 || age > 100){ //!! if age is invalid
            System.err.println("Invalid Age: "+age);
            // return; // exiting the method
            System.exit(1); //!! entire program gets terminated
        }//if close

        this.age = age;
    }//setAge


}//class
