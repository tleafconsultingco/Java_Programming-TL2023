package day28_encapsulation.personTask;

public class Class02_TestPersonObjects {

    public static void main(String[] args) {

        //!! person with name
        Class01_Person person1 = new Class01_Person("Alpha");
        //!! person with name and gender
        Class01_Person person2 = new Class01_Person("Bravo",'M');
        //!! person with name and age
        Class01_Person person3 = new Class01_Person("Charlie", 18);
        //!! person with name and language
        Class01_Person person4 = new Class01_Person("Delta","English");
        //!! person with name, age, and gender
        Class01_Person person5 = new Class01_Person("Echo",21,'F');
        //!! person with name, age, gender, and language
        Class01_Person person6 = new Class01_Person("Foxtrot",25,'F',"Spanish");

        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);
        System.out.println("person3 = " + person3);
        System.out.println("person4 = " + person4);
        System.out.println("person5 = " + person5);
        System.out.println("person6 = " + person6);
            //person1 = Class01_Person{name='Alpha', age=0, gender= , language='null', planet='Earth'}
            //person2 = Class01_Person{name='Bravo', age=0, gender=M, language='null', planet='Earth'}
            //person3 = Class01_Person{name='Charlie', age=18, gender= , language='null', planet='Earth'}
            //person4 = Class01_Person{name='Delta', age=0, gender= , language='English', planet='Earth'}
            //person5 = Class01_Person{name='Echo', age=21, gender=F, language='null', planet='Earth'}
            //person6 = Class01_Person{name='Foxtrot', age=25, gender=F, language='Spanish', planet='Earth'}

        //!! Can reassign instance variable name
        person1.name = "Apple";
        System.out.println("person1 = " + person1);
            //person1 = Class01_Person{name='Apple', age=0, gender= , language='null', planet='Earth'}

        //!! Not necessary to call the static variables through the objects, since statics belong to the class
        person1.planet = "Mars"; //!! this will change ALL the objects planet (because planet is static)

        //!! To change a static variable, change through the class
        Class01_Person.planet = "Mars";

        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);
        System.out.println("person3 = " + person3);
        System.out.println("person4 = " + person4);
        System.out.println("person5 = " + person5);
        System.out.println("person6 = " + person6);
            //person1 = Class01_Person{name='Apple', age=0, gender= , language='null', planet='Mars'}
            //person2 = Class01_Person{name='Bravo', age=0, gender=M, language='null', planet='Mars'}
            //person3 = Class01_Person{name='Charlie', age=18, gender= , language='null', planet='Mars'}
            //person4 = Class01_Person{name='Delta', age=0, gender= , language='English', planet='Mars'}
            //person5 = Class01_Person{name='Echo', age=21, gender=F, language='null', planet='Mars'}
            //person6 = Class01_Person{name='Foxtrot', age=25, gender=F, language='Spanish', planet='Mars'}

        Class01_Person.printPlanetName();
            //Planet name is: Mars

        //?? Instance methods
        person1.eat("Baklava");
            //Apple is eating Baklava
        person2.drink("Water");
            //Bravo is drinking Water
        person5.drink("Tea");
            //Echo is drinking Tea
        person6.drink("Coffee");
            //Foxtrot is drinking Coffee




    }//main
}//class
