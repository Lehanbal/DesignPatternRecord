package top.lehanbal.Temp.Pizza;

public abstract class Pizza {
    private String name;

    public abstract void prepare();

    public void bake(){
        System.out.println("当前在烘焙面包");
    }

    public void cut(){
        System.out.println("当前在切割面包");
    }

    public void send(){
        System.out.println("当前在派送面包");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
