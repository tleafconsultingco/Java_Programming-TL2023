package utilities;
import java.util.Scanner;
public class Timer {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of minutes");
        int minutes=scan.nextInt();
        scan.close();

        for(int i=minutes; i>0;i--){
            for (int z=59;z>=0;z--){
                System.out.println("\r"+(i-1)+" minutes and "+z+ " seconds left");
                Thread.sleep(1000);
            }//inner For loop close
        }//outer For loop close

        System.out.println("\n\n");

        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * *");
        System.err.println("\t\t\t*                                             *");
        System.err.println("\t\t\t*     Time is up, Please take your seats!     *");
        System.err.println("\t\t\t*                                             *");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * *");

    }//main close
}//class close
