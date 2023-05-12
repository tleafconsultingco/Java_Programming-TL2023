package day29_inheritance;

public class Class07_Zoo {

    public static void main(String[] args) {

        //- Create objects
        Class04_Dog dog = new Class04_Dog();
        dog.setInfo("Max","Husky",'M',4,"Large","White");

        Class05_Cat cat = new Class05_Cat();
        cat.setInfo("Felicia", "stray",'F',3,"Medium,","Black and White");

        Class06_Tiger tiger = new Class06_Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',5,"Large","Orange");

        System.out.println("dog = " + dog);
            //dog = Class04_Dog{name='Max', breed='Husky', size='Large', color='White', gender=M, age=4}
        System.out.println("cat = " + cat);
            //cat = Class05_Cat{name='Felicia', breed='stray', size='Medium,', color='Black and White', gender=F, age=3}
        System.out.println("tiger = " + tiger);
            //tiger = Class06_Tiger{name='Sher Khan', breed='Bengal', size='Large', color='Orange', gender=M, age=5}

        System.out.println("-- methods from Animal super class --");
        dog.eat(); //Max is eating
        dog.drink(); //Max is drinking water
        dog.sleep(); //Max is sleeping

        cat.eat(); //Felicia is eating
        cat.drink(); //Felicia is drinking water
        cat.sleep(); //Felicia is sleeping

        tiger.eat(); //Sher Khan is eating
        tiger.drink(); //Sher Khan is drinking water
        tiger.sleep(); //Sher Khan is sleeping

        System.out.println("-- methods specific to each subclass --");
        dog.bark(); //Max is barking
        //cat.bark();
        //tiger.bark();

        cat.meow(); //Felicia is meowing
        //dog.meow();
        //tiger.meow();
        cat.scratch(); //Felicia is scratching
        //dog.scratch();
        //tiger.scratch();

        tiger.hunt(); //Sher Khan is hunting
        //dog.hunt();
        //cat.hunt();

        System.out.println("-- Using getter and setter methods --");
        /*
        //!! These variables have not been set and they are private, which means they cannot be inherited
        System.out.println(dog.name);
        System.out.println(dog.color);
        dog.gender = 'K';
        dog.age = -100;
        */

        //!! These methods are public, which makes them accessible to the sub classes (even though the instance variable itself is private)
        System.out.println(dog.getName()); //Max
        System.out.println(dog.getColor()); //White

        dog.setGender('F');
        dog.setAge(8);

        System.out.println(dog);
            //Class04_Dog{name='Max', breed='Husky', size='Large', color='White', gender=F, age=8}


    }//main
}//class
