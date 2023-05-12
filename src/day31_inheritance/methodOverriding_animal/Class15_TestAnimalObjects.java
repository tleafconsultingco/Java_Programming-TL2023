package day31_inheritance.methodOverriding_animal;

public class Class15_TestAnimalObjects {

    public static void main(String[] args) {

        Class11_Cat cat = new Class11_Cat("Emily", "Bangle", "Small", "Gray", 'F', 4);

        Class12_Dog dog = new Class12_Dog("Max", "Husky", "Large", "White", 'M', 3);

        Class13_Lion lion = new Class13_Lion("Simba", "African Lion", "Large", "Yellow", 'M',6, true);

        Class14_Eagle eagle = new Class14_Eagle("Bella", "American Eagle", "Medium", "Black and White", 'F', 4);


        System.out.println("cat = " + cat);
            //cat = Class11_Cat{name='Emily', breed='Bangle', size='Small', color='Gray', gender=F, age=4}
        System.out.println("dog = " + dog);
            //dog = Class12_Dog{name='Max', breed='Husky', size='Large', color='White', gender=M, age=3}
        System.out.println("lion = " + lion);
            //lion = Class13_Lion{name='Simba', breed='African Lion', size='Large', color='Yellow', gender=M, age=6, African lion='true'}
        System.out.println("eagle = " + eagle);
            //eagle = Class14_Eagle{name='Bella', breed='American Eagle', size='Medium', color='Black and White', gender=F, age=4}

        System.out.println("--------------------------------------------------------");

        cat.eat(); //Cat Emily is eating cat food
        dog.eat(); //Dog Max is eating dog food
        eagle.eat(); //Eagle Bella is eating snake
        lion.eat(); //Lion Simba is eating deer

        System.out.println("----------------------------------------------------------");

        cat.sleep(); //Cat Emily sleeps 12 hours in a day
        dog.sleep(); //Max is sleeping
        eagle.sleep(); //Bella is sleeping
        lion.sleep(); //Simba is sleeping


    }//main

}//class
