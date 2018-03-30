package Singleton;

/**
 * 双重校验锁 线程安全
 */
public class Singleton_doublecheck_safe {
    private static volatile Singleton_doublecheck_safe ourInstance;

    public static Singleton_doublecheck_safe getInstance() {
        if(ourInstance==null){
            synchronized (Singleton_doublecheck_safe.class){
                if(ourInstance==null){
                    ourInstance = new Singleton_doublecheck_safe();
                }
            }
        }
        return ourInstance;
    }

    private Singleton_doublecheck_safe() {
    }
}
