package top.lehanbal.static_inner_class;

public class InnerClass {
    public static void main(String[] args) {
        Singleton type1 = Singleton.getInstance();
        Singleton type2 = Singleton.getInstance();

        System.out.println(type1 == type2);
        System.out.println(type1.hashCode());
        System.out.println(type2.hashCode());
    }
}

/**
 * 使用静态内部类的方式进行的单例，该方法也值得推荐
 * jvm的类转载机制：
 *      当外部类被转载的时候，内部类并不会被转载
 *      当使用到内部类的内容的时候，内部类会被转载并且只会被装载1次，所以也解决的线程同步的问题
 */
class Singleton {
    private Singleton() {

    }

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
