package day39_collections;

public class Class03_TestMultiThread {

    public static void main(String[] args) {

        Class02_ThreadHelloWorld thread1 = new Class02_ThreadHelloWorld(1);
        Class02_ThreadHelloWorld thread2 = new Class02_ThreadHelloWorld(2);
        Class02_ThreadHelloWorld thread3 = new Class02_ThreadHelloWorld(3);
        Class02_ThreadHelloWorld thread4 = new Class02_ThreadHelloWorld(4);
        Class02_ThreadHelloWorld thread5 = new Class02_ThreadHelloWorld(5);


/*
        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();
        thread5.run();

 */

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        //!! All thread objects execute at the same time
        // Hello world 1 from Thread 3
        // Hello world 1 from Thread 2
        // Hello world 1 from Thread 4
        // Hello world 1 from Thread 1
        // Hello world 1 from Thread 5

        // Hello world 2 from Thread 3
        // Hello world 2 from Thread 2
        // Hello world 2 from Thread 5
        // Hello world 2 from Thread 4
        // Hello world 2 from Thread 1

        // Hello world 3 from Thread 2
        // Hello world 3 from Thread 1
        // Hello world 3 from Thread 4
        // Hello world 3 from Thread 3
        // Hello world 3 from Thread 5

        // Hello world 4 from Thread 1
        // Hello world 4 from Thread 5
        // Hello world 4 from Thread 3
        // Hello world 4 from Thread 4
        // Hello world 4 from Thread 2

        // Hello world 5 from Thread 1
        // Hello world 5 from Thread 2
        // Hello world 5 from Thread 4
        // Hello world 5 from Thread 5
        // Hello world 5 from Thread 3


    }


}
