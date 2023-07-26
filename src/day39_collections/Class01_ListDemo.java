package day39_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Class01_ListDemo {

    public static void main(String[] args) {

        System.out.println("-- ArrayList --");
        ArrayList<Integer> arrayList = new ArrayList<>(); //!! Array Based Class ===> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        System.out.println("arrayList = " + arrayList); //arrayList = [100, 200, 300]

        arrayList.remove(0);
        System.out.println("arrayList = " + arrayList); //arrayList = [200, 300]

        arrayList.get(0);
        System.out.println("arrayList.get(0) = " + arrayList.get(0)); //arrayList.get(0) = 200


        System.out.println("-- LinkedList --");
        LinkedList<Integer> linkedList = new LinkedList<>(); //!! Node based class (Doubly linked List) ===> add(), addAll(), remove(), removeAll(), removeIf(), retainAll() are faster

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        System.out.println("linkedList = " + linkedList); //linkedList = [100, 200, 300]

        linkedList.remove(0);
        System.out.println("linkedList = " + linkedList); //linkedList = [200, 300]

        linkedList.get(0);
        System.out.println("linkedList.get(0) = " + linkedList.get(0)); //linkedList.get(0) = 200


        System.out.println("-- Vector --");
        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);
        System.out.println("vector = " + vector); //vector = [100, 200, 300]

        vector.get(0);
        System.out.println("vector.get(0) = " + vector.get(0)); //vector.get(0) = 100


        System.out.println("-- Stack --");
        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);
        System.out.println(stack); //[100, 200, 300]

        int lastElement = stack.pop();
        System.out.println(stack); //[100, 200]

        int secondLastElement = stack.pop();
        System.out.println(secondLastElement); //200
    }
}
