package Singleton;

/**
 * 懒汉式 线程安全
 */
public class Singleton_lazy_safe {
    private static Singleton_lazy_safe ourInstance;

    public static synchronized Singleton_lazy_safe getInstance() {
        if(ourInstance==null){
            ourInstance = new Singleton_lazy_safe();
        }
        return ourInstance;
    }

    private Singleton_lazy_safe() {
    }
}
