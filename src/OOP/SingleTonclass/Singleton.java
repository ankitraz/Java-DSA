package OOP.SingleTonclass;

// singleton class - only allow us to make only one object
public class Singleton {
    // we should not allow to call constructor
//    private  int num = 0;
     private Singleton(){

    }

    private static  Singleton instance;
     public static Singleton getInstance(){
        //check whether 1 obj only is crated or not
         if(instance == null){
             instance = new Singleton();
         }
         return instance;
     }
}
