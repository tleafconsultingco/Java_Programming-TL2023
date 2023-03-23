package day07_if_statements;

public class Study01_NestedIf {

    public static void main(String[] args) {

        System.out.println(examResult(91));


    }

    public static String examResult(int score){

        String result = "";

        if(score>=0&&score<=100){ // checks first

            if(score>=90){
                result = "Excellent";
            }else if(score>=80){
                result = "Great";
            }else if(score>=70){
                result = "Good";
            }else if (score>=60){
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{
            result = "WTF";
        }

        return result;




    }


}
