package utilities;

public class Test {

    //- Constructor chaining
    public Test(){ //?? constructor 1
        this(10.5); //!! calls the constructor w/ parameter
        System.out.println("A");
    }

    public Test(int a){ //?? constructor 2
        System.out.println("B");
    }

    public Test(String b){ //?? constructor 3
        System.out.println("C");
    }

    public Test (double doubles){
       this("hello");
        System.out.println("D");
    }

    public static void main(String[] args) {
        Test obj = new Test();
    }
}
