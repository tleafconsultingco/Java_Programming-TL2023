package day41_maps;

import java.util.*;

public class Class02_ArrayPractice {
    public static void main(String[] args) {

        System.out.println("-- Lists --");
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(70, 80, 90, 100, 110));


        System.out.println("-- Array of lists --");
        List<Integer>[] arrayOfLists = new List[3];
        arrayOfLists[0] = list1;
        arrayOfLists[1] = list2;
        arrayOfLists[2] = list3;

        System.out.println("Arrays.toString(arrayOfLists) = " + Arrays.toString(arrayOfLists));
            //Arrays.toString(arrayOfLists) = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]

        //!! update a value in the 0 index that has current value of 4 to new value of 50
        arrayOfLists[0].set(4, 50);
        System.out.println("Arrays.toString(arrayOfLists) = " + Arrays.toString(arrayOfLists));
            //Arrays.toString(arrayOfLists) = [[1, 2, 3, 4, 50, 6], [7, 8, 9, 10, 11], [70, 80, 90, 100, 110]]


        System.out.println("-- Array of sets --");

        //!! Create new array of sets, add sets as elements
        Set<Integer>[] arrayOfSets = new Set[5];
        arrayOfSets[0] = new LinkedHashSet<>();
        arrayOfSets[1] = new LinkedHashSet<>();
        arrayOfSets[2] = new LinkedHashSet<>();
        arrayOfSets[3] = new LinkedHashSet<>();
        arrayOfSets[4] = new LinkedHashSet<>();

        System.out.println("Arrays.toString(arrayOfSets) = " + Arrays.toString(arrayOfSets));
            //Arrays.toString(arrayOfSets) = [[], [], [], [], []]

        //!! Update index 2 with elements
        arrayOfSets[2].addAll(Arrays.asList(1, 2, 3, 4));
        System.out.println("Arrays.toString(arrayOfSets) = " + Arrays.toString(arrayOfSets));
            //Arrays.toString(arrayOfSets) = [[], [], [1, 2, 3, 4], [], []]



    }


}
