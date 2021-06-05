package top.lehanbal.static_constant_hungry;

public class HungryMan {
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
 * 静态变量的俄汉式
 * 优点：
 *  写法简单，在类进行加载的时候就已经完成了单例的创建，减少了线程同步问题
 * 缺点：
 *  也是因为在类加载的时候就已经完成了创建，没有达成lazy loading的效果，如果该类从头到尾没用过，就造成了内存浪费
 */
class Singleton {

    //私有构造器，不能通过new来创建该单例对象
    private Singleton(){

    }

    //既然不能通过new来创建这个对象，那么在该类进行加载的时候就创建一个该单例
    private static final Singleton instance = new Singleton();

    //创建了该对象，对外提供一个公共的获取该类对象的方法即可。
    public static Singleton getInstance(){
        return instance;
    }
}
