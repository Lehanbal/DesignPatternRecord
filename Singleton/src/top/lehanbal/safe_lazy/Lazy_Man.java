package top.lehanbal.safe_lazy;

public class Lazy_Man {
    public static void main(String[] args) {
        //验证创建出来的对象是否是单例
        Singleton type1 = Singleton.getInstance();
        Singleton type2 = Singleton.getInstance();
        System.out.println(type1 == type2);

        System.out.println(type1.hashCode());
        System.out.println(type2.hashCode());
    }
}

/**
 * 懒汉式，需要用到的时候才会去创建，但是线程安全，使用synchronize关键字保证线程同步，但是这带来了效率问题，
 * 每次去getInstance的时候都会进行一次线程同步，而且getInstance这件事情是经常发生的
 */
class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}