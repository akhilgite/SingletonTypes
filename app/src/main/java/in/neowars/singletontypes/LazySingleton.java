package in.neowars.singletontypes;

/**
 * Created by akhil on 26/6/17.
 */

public class LazySingleton {
    private static LazySingleton mInstance;

    private LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if (mInstance==null){
            mInstance=new LazySingleton();
        }
        return mInstance;
    }
}
