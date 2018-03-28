package Singleton;

/**
 * 懒汉式 线程不安全
 */
public class Singleton_lazy_unsafe {
    private static Singleton_lazy_unsafe ourInstance;

    public static Singleton_lazy_unsafe getInstance() {
        if(ourInstance==null){
            ourInstance = new Singleton_lazy_unsafe();
        }
        return ourInstance;
    }

    private Singleton_lazy_unsafe() {
    }
}
