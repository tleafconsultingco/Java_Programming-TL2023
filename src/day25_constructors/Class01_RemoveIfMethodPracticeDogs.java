package day25_constructors;

import day17_customClass.Class05_Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class Class01_RemoveIfMethodPracticeDogs {
    public static void main(String[] args) {

        Class05_Dog[] dogs = {new Class05_Dog(), new Class05_Dog(), new Class05_Dog(), new Class05_Dog(), new Class05_Dog(), new Class05_Dog()};

        dogs[0].setInfo("Max", "Husky", "Med", 'M', 4, "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", "Large", 'M', 8, "Gold");
        dogs[2].setInfo("Molly", "Beagle", "Small", 'F', 5, "White");
        dogs[3].setInfo("Oliver", "Bulldog", "Small", 'M', 2, "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", "Small", 'F', 3, "White");
        dogs[5].setInfo("Loki", "Chow Chow", "Med", 'M', 7, "Gold");


        //? Create smallDogs ArrayList
            //?? How to set the datatype?
        ArrayList<Class05_Dog> smallDogsWithLoop = new ArrayList<>();

        //! Using For-each loop
            //!! Iterate each element
            //!! Check condition based on size
            //!! Add to ArrayList

        for (Class05_Dog each : dogs) {
            if(each.size.equalsIgnoreCase("small")){ //!! Use equalsIgnoreCase since you're comparing Strings
                smallDogsWithLoop.add(each); //!! If the condition is true then the element will be added to the smallDogs ArrayList
            }//if close
        }//for-each close

        System.out.println("smallDogs = " + smallDogsWithLoop);
            //smallDogsWithLoop = [Class05_Dog{name='Molly', breed='Beagle', size='Small', gender=F, age=5, color='White'}, Class05_Dog{name='Oliver', breed='Bulldog', size='Small', gender=M, age=2, color='Black'}, Class05_Dog{name='Bella', breed='Bichon Frise', size='Small', gender=F, age=3, color='White'}]

        //! Without using a loop
            //!! Add all the dogs from Array to ArrayList
            //!! Remove dogs that don't have the size "small"

        ArrayList<Class05_Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));
        System.out.println("smallDogs = " + smallDogs);
            //smallDogs = [Class05_Dog{name='Max', breed='Husky', size='Med', gender=M, age=4, color='Gray'}, Class05_Dog{name='Chloe', breed='Golden Retriever', size='Large', gender=M, age=8, color='Gold'}, Class05_Dog{name='Molly', breed='Beagle', size='Small', gender=F, age=5, color='White'}, Class05_Dog{name='Oliver', breed='Bulldog', size='Small', gender=M, age=2, color='Black'}, Class05_Dog{name='Bella', breed='Bichon Frise', size='Small', gender=F, age=3, color='White'}, Class05_Dog{name='Loki', breed='Chow Chow', size='Med', gender=M, age=7, color='Gold'}]

        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("small"));
        System.out.println("smallDogs = " + smallDogs);
            //smallDogs = [Class05_Dog{name='Molly', breed='Beagle', size='Small', gender=F, age=5, color='White'}, Class05_Dog{name='Oliver', breed='Bulldog', size='Small', gender=M, age=2, color='Black'}, Class05_Dog{name='Bella', breed='Bichon Frise', size='Small', gender=F, age=3, color='White'}]

        //? Create youngDogs ArrayList
        ArrayList<Class05_Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));
        youngDogs.removeIf(p -> p.age>4);
        System.out.println("youngDogs = " + youngDogs);
            //youngDogs = [Class05_Dog{name='Max', breed='Husky', size='Med', gender=M, age=4, color='Gray'}, Class05_Dog{name='Oliver', breed='Bulldog', size='Small', gender=M, age=2, color='Black'}, Class05_Dog{name='Bella', breed='Bichon Frise', size='Small', gender=F, age=3, color='White'}]

        //? Create femaleDogs ArrayList
        ArrayList<Class05_Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p -> p.gender =='M');
        System.out.println("femaleDogs = " + femaleDogs);
            //femaleDogs = [Class05_Dog{name='Molly', breed='Beagle', size='Small', gender=F, age=5, color='White'}, Class05_Dog{name='Bella', breed='Bichon Frise', size='Small', gender=F, age=3, color='White'}]

        //? Create maleDogs ArrayList
        ArrayList<Class05_Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p -> p.gender =='F');
        System.out.println("maleDogs = " + maleDogs);
            //maleDogs = [Class05_Dog{name='Max', breed='Husky', size='Med', gender=M, age=4, color='Gray'}, Class05_Dog{name='Chloe', breed='Golden Retriever', size='Large', gender=M, age=8, color='Gold'}, Class05_Dog{name='Oliver', breed='Bulldog', size='Small', gender=M, age=2, color='Black'}, Class05_Dog{name='Loki', breed='Chow Chow', size='Med', gender=M, age=7, color='Gold'}]

        System.out.println("-- Repeat tasks but keep Array as Array --");

        Class05_Dog[] dogs2 = {new Class05_Dog(), new Class05_Dog(), new Class05_Dog(), new Class05_Dog(), new Class05_Dog(), new Class05_Dog()};

        dogs2[0].setInfo("Max", "Husky", "Med", 'M', 4, "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", "Large", 'M', 8, "Gold");
        dogs2[2].setInfo("Molly", "Beagle", "Small", 'F', 5, "White");
        dogs2[3].setInfo("Oliver", "Bulldog", "Small", 'M', 2, "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", "Small", 'F', 3, "White");
        dogs2[5].setInfo("Loki", "Chow Chow", "Med", 'M', 7, "Gold");

        System.out.println("dogs2 = " + Arrays.toString(dogs2));
            //dogs2 = [Class05_Dog{name='Max', breed='Husky', size='Med', gender=M, age=4, color='Gray'}, Class05_Dog{name='Chloe', breed='Golden Retriever', size='Large', gender=M, age=8, color='Gold'}, Class05_Dog{name='Molly', breed='Beagle', size='Small', gender=F, age=5, color='White'}, Class05_Dog{name='Oliver', breed='Bulldog', size='Small', gender=M, age=2, color='Black'}, Class05_Dog{name='Bella', breed='Bichon Frise', size='Small', gender=F, age=3, color='White'}, Class05_Dog{name='Loki', breed='Chow Chow', size='Med', gender=M, age=7, color='Gold'}]


        //? Create smallDogs Array
            //?? Can't remove elements bc Array is fixed, the only way specified elements in an array is to create a new array
        //!! Recall you can make an ArrayList out of an Array using the asList() Array utility method
        ArrayList<Class05_Dog> list = new ArrayList<>(Arrays.asList(dogs2));
        //!! Update the ArrayList with the condition for only small dogs using removeIf()
        list.removeIf(p -> !p.size.equalsIgnoreCase("small"));

        //! Convert list ArrayList to Array using toArray() ArrayList method
        dogs2 = list.toArray(new Class05_Dog[list.size()]); //!! Set the size of the new Array to size fo the ArrayList
        System.out.println("dogs2 = " + Arrays.toString(dogs2));
            //dogs2 = [Class05_Dog{name='Molly', breed='Beagle', size='Small', gender=F, age=5, color='White'}, Class05_Dog{name='Oliver', breed='Bulldog', size='Small', gender=M, age=2, color='Black'}, Class05_Dog{name='Bella', breed='Bichon Frise', size='Small', gender=F, age=3, color='White'}]



    }//main
}//class
/*
Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

	            Note: DO NOT use any loops
 */