package day17_customClass;

public class Class08_TestEmployeeObjects {
    public static void main(String[] args) {

        // create object
        Class07_Employee employee1 = new Class07_Employee();
        employee1.setInfo("Java",30,'F',"SDET developer",250000,"J123");
        System.out.println(employee1);

        Class07_Employee employee2 = new Class07_Employee();
        employee2.setInfo("Python",100,'M',"Hacker",150000.5,"P456");
        System.out.println(employee2);

        Class07_Employee employee3 = new Class07_Employee();
        employee3.setInfo("HTML",75,'F',"Coder",1000000,"H789");
        System.out.println(employee3);


        employee1.work();
        employee2.onVacation();
        employee3.work();


    } // close main
} // close Class
