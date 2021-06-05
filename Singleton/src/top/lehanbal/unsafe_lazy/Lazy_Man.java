package top.lehanbal.unsafe_lazy;

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
 * 懒汉式，需要用到的时候才会去创建，但是线程不安全，当多个线程一起执行到if判断内时，就会产生多个实例，并不能保证单例
 */
class Singleton{
    private Singleton(){};

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}