package day41_maps;

import studyGroup.polymorphism.Employee;

import java.util.*;

public class Class01_CollectionPractice {

    public static void main(String[] args) {

        System.out.println("-- List of ... --");
        //?? You can make a list of collections but that is not the same as multidimensional
        //!! A list of list
        List<List<Integer>> listOfList = new ArrayList<>();
        //!! List of array
        List<int[]> listOfIntArray = new ArrayList<>();
        //!! List of queue
        List<Queue<Integer>> listOfQueue = new ArrayList<>();

        System.out.println("-- ArrayList --");

        //!! list 1
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5,6));

        //!! list 2
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));

        //!! Combine list 1 and 2
        List<List<Integer>> lists = new ArrayList<>();
        // lists.addAll( Arrays.asList(list1, list2));
        lists.add(list1);
        lists.add(list2);

        System.out.println("lists = " + lists);
            //lists = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11]]
            //index     0                   1

        System.out.println("lists.get(1).get(3) = " + lists.get(1).get(3));
        //!! It will go to index 1 that contains the second list, then index 3 within index 1
            //lists.get(1).get(3) = 10

        //!! Nested for-each loop, first to iterate through the list of lists, then to iterate through each element in each list
        for(List<Integer> eachList  : lists){
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
                    //1
                    //2
                    //3
                    //4
                    //5
                    //6
                    //7
                    //8
                    //9
                    //10
                    //11
            }
        }


        System.out.println("-- List of Set --");

        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());  // 0
        listOfSets.add(new LinkedHashSet<>());  // 1
        listOfSets.add(new LinkedHashSet<>());  // 2
        listOfSets.add(new LinkedHashSet<>());  // 3
            //size of this list is 4 (there are 4 sets in this list)

        System.out.println("listOfSets = " + listOfSets);
            //listOfSets = [[], [], [], []]

        //!! To add elements to each set you need to get the set (from its index number), then add elements
        listOfSets.get(0).addAll(Arrays.asList(10, 5, 20, 10, 5, 20));
        listOfSets.get(1).addAll(Arrays.asList(30, 15, 30));
        listOfSets.get(2).addAll(Arrays.asList(300, 150, 40));
        listOfSets.get(3).addAll(Arrays.asList(30000, 1, 5));

        System.out.println("listOfSets = " + listOfSets);
            //listOfSets = [[10, 5, 20], [30, 15], [300, 150, 40], [30000, 1, 5]]


        System.out.println("-- List of arrays --");

        //!! Create 2 arrays
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9, 10};

        //!! Create a List of the arrays
        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        System.out.println("Arrays.toString(listOfArrays) = " + Arrays.toString(listOfArrays.get(0)));
            //Arrays.toString(listOfArrays) = [1, 2, 3, 4]

        //!! update the 3rd element by getting the array at 0 index, then update the 2nd index in that array
        listOfArrays.get(0)[2] = 35;
        System.out.println("Arrays.toString(listOfArrays) = " +  Arrays.toString( listOfArrays.get(0) ) );
            //Arrays.toString(listOfArrays) = [1, 2, 35, 4]

        System.out.println("--------------------------------------------");

        List<List<Employee>> teams = new ArrayList<>();
            //?? What can I store? A list object that contains employee objects


    }


}
