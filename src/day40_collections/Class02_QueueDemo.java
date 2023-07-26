package day40_collections;

import java.util.*;

public class Class02_QueueDemo {

    public static void main(String[] args) {

        System.out.println("-- PriorityQueue -- ");
        Queue<Integer> queue1 = new PriorityQueue<>(); //!! order is random, does not accept null
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //!! doesnt accept null
            //queue1.addAll(Arrays.asList(null, null, null));

        System.out.println("queue1 = " + queue1);
            //queue1 = [10, 10, 10, 10, 40, 200, 40, 40, 40, 90, 90, 300, 300, 200, 90, 300, 200, 300, 200, 90]

        int num1 = queue1.poll(); //!! ===> FIFO
        System.out.println("queue1 = " + queue1);
            //!! removes the first element (10)
            //queue1 = [10, 10, 10, 40, 40, 200, 40, 90, 40, 90, 90, 300, 300, 200, 90, 300, 200, 300, 200]

        //!! removes the next 3 elements (10, 10, 10)
        queue1.poll();
        queue1.poll();
        queue1.poll();
        System.out.println("queue1 = " + queue1);
            //queue1 = [40, 40, 40, 90, 40, 200, 90, 200, 200, 90, 90, 300, 300, 200, 300, 300]

        //  System.out.println(queue1.get(4));


        System.out.println("-- ArrayDeque -- ");
        Queue<Integer> queue2 = new ArrayDeque<>(); //!! insertion order, does not accept null
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //!! doesnt accept null
            // queue2.addAll(Arrays.asList(null, null, null));

        System.out.println("queue2 = " + queue2);
            //queue2 = [10, 200, 300, 40, 90, 10, 200, 300, 40, 90]

        //!! removes the first element (10)
        queue2.poll();
        System.out.println("queue2 = " + queue2);
            //queue2 = [200, 300, 40, 90, 10, 200, 300, 40, 90]

        //!! removes the next 9 elements
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        System.out.println("queue2 = " + queue2);
            //queue2 = []

        //!! Cannot use get() method from ArrayList
        //  System.out.println(queue2.get(3));

        System.out.println("-- LinkedList -- ");

        Queue<Integer> queue3 = new LinkedList<>(); //!! insertion order, accepts null, has index
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(null, null, null));

        System.out.println("queue3 = " + queue3);
            //queue3 = [10, 200, 300, 40, 90, 10, 200, 300, 40, 90, null, null, null]

        //!! removes the next element (10)
        queue3.poll();
        System.out.println("queue3 = " + queue3);
            //queue3 = [200, 300, 40, 90, 10, 200, 300, 40, 90, null, null, null]

        //!! downcast to LinkedList methods
        System.out.println("((LinkedList)queue3).get(4) = " + ((LinkedList) queue3).get(4));
            //((LinkedList)queue3).get(4) = 10


        System.out.println("-- LinkedList from List --");

        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        //!! Can use the get() method from List
        System.out.println("list.get(1) = " + list.get(1));
            //list.get(1) = 200

        System.out.println("list = " + list);
            //list = [10, 200, 300, 40, 90]

        //!! downcast to use poll() method from LinkedList queue
        //!! will remove the first element
        ( (LinkedList)list).poll();  //!! FIFO
        System.out.println("list = " + list);
            //list = [200, 300, 40, 90]

        //!! cannot use pop() method from Stack
        // ( (Stack)list ).pop();   //!! LIFO

        System.out.println("list = " + list);
        //list = [200, 300, 40, 90]




    }


}
