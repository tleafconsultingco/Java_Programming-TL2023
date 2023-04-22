package day28_encapsulation.personTask;

public class Class01_Person {

    //- Variables

    //-- Instance variables
    public String name;
    public int age;
    public char gender;
    public String language;
    //-- Static variables
    public static String planet;
    public static boolean isHuman,hasNose;
    public static int numberOfWings,numberOfHead;

    //- Constructor for creating objects  instance variables

    //-- Constructor for name
    public Class01_Person(String name){
        this.name = name;
    }//constructor

    //-- Constructor for name and age
    public Class01_Person(String name, int age){
        this(name); //!! For using name constructor
        this.age = age;
    }//constructor

    //-- Constructor for name and language
    public Class01_Person(String name, String language){
        this(name);
        this.language = language;
    }//constructor

    //-- Constructor for name and gender
    public Class01_Person(String name, char gender){
        this(name);
        this.gender = gender;
    }//constructor

    //-- Constructor for name, age, and gender
    public Class01_Person(String name, int age, char gender){
        this(name,age);
        this.gender = gender;
    }//constructor

    //-- Constructor for name, age, gender, language
    public Class01_Person(String name, int age, char gender, String language){
        this(name, age, gender);
        this.language = language;
    }//constructor


    //- Static block to initialize static variables
    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }//static


    //- Methods

    public static void printPlanetName(){
        System.out.println("Planet name is: "+planet);
    }//printPlanetName

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }//eat

    public void drink (String drink){
        System.out.println(name+" is drinking "+drink);
    }//drink

    @Override
    public String toString() {
        return "Class01_Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}//class
/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */