package top.lehanbal.code_block_hungry;

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
 * 优缺点与静态常量的方式一样，不过这种方法是将实例化过程放在了静态代码块之中
 */
class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    //使用静态代码块进行实例化，此处在类加载的时候就开始将该类装进内存了
    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
