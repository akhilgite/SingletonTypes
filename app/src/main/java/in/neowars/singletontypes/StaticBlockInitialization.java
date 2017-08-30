package in.neowars.singletontypes;

/**
 * Created by akhil on 26/6/17.
 */

/**
 * It is similar eager initialization except that instance of class created inside static block that
 * gives options to for exception handling
 */

public class StaticBlockInitialization {
    private static StaticBlockInitialization mInstance;

    private StaticBlockInitialization(){

    }

    static {
        try{
            mInstance=new StaticBlockInitialization();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static StaticBlockInitialization getInstance(){
        return mInstance;
    }
}
