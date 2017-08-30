package in.neowars.singletontypes;

/**
 * Created by akhil on 26/6/17.
 */

//Eager initialization
public class EarlySingleton {
    private EarlySingleton(){

    }
    private static final EarlySingleton mInstance=new EarlySingleton();

    public static EarlySingleton getInstance(){
        return mInstance;
    }
}
