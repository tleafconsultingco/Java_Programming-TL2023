package studyGroup.encapsulation_inheritance_0502t;

class Q04_Caller {

         private void init(){
            System.out.println("Initialized");
        }

        private void start(){
            init();
            System.out.println("Started");
        }

    }

/*
&& issue with public
    public class TestCall{
        public static void main(String[] args){
            Q04_Caller c = new Q04_Caller();
            //c.start();
            // !! calls a private method
            //c.init();
            // !! calls a private method
        }


    }
*/


