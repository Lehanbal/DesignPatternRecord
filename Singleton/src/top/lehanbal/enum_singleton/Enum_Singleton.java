package top.lehanbal.enum_singleton;

public class Enum_Singleton {
    public static void main(String[] args) {
        Singleton type1 = Singleton.INSTANCE;
        Singleton type2 = Singleton.INSTANCE;

        System.out.println(type1 == type2);
        System.out.println(type1.hashCode());
        System.out.println(type2.hashCode());

        type1.func1();
    }
}

/**
 * 简单粗暴的枚举单例，也是值得推荐使用
 * 能够解决线程问题
 * 能防止反序列化
 */
enum Singleton {
    INSTANCE;

    public void func1() {
        System.out.println("hello");
    }
}
