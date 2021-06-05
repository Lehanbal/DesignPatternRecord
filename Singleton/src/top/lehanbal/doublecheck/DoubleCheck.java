package top.lehanbal.doublecheck;

public class DoubleCheck {
    public static void main(String[] args) {
        Singleton type1 = Singleton.getInstance();
        Singleton type2 = Singleton.getInstance();

        System.out.println(type1 == type2);
        System.out.println(type1.hashCode());
        System.out.println(type2.hashCode());
    }
}

/**
 * double check单例。双重检查，挺好的，建议开发中使用
 */
class Singleton {
    private Singleton() {
    }
    //volatile防止指令重排
    private static volatile Singleton instance;

    public static Singleton getInstance(){
        //此处进行第一次判断，当拥有实例之后就不会再进行同步代码块的判定了，也就避免了效率问题
        if(instance == null){
            synchronized (Singleton.class){
                //同步代码之后再进行一次判断，如果为空就创建一个实例。
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
