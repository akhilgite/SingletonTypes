package in.neowars.singletontypes;

/**
 * Created by akhil on 26/6/17.
 */

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton mInstance;

    private ThreadSafeSingleton() {
    }

    //1st type : prob in this type is every time while accessing this method every thread has to
    //wait for monitor. we want only single instance to be created in multithreaded enviroment and it
    //satisfies its goal bt we can modify this method
    public synchronized ThreadSafeSingleton getInstance() {
        if (mInstance == null) {
            mInstance = new ThreadSafeSingleton();
        }
        return mInstance;
    }

    //In this method thread will wait only at the time of creating new instance and rest of the time
    //they can access this thread easily
    public ThreadSafeSingleton getInstance2() {
        if (mInstance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (mInstance == null) {
                    mInstance = new ThreadSafeSingleton();
                }
            }
        }
        return mInstance;
    }
}
