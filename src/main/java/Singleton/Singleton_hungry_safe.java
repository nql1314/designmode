package Singleton;

/**
 * 饿汉式 线程安全 丢失了延迟实例化带来的节约资源的优势
 */
public class Singleton_hungry_safe {
    private static Singleton_hungry_safe ourInstance = new Singleton_hungry_safe();

    public static Singleton_hungry_safe getInstance() {
        return ourInstance;
    }

    private Singleton_hungry_safe() {
    }
}
