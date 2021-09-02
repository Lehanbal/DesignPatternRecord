package top.lehanbal.Temp.Order;

import top.lehanbal.Temp.Pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

public class Order {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Order() {
        do{
            try {
                Class aClass = Class.forName("top.lehanbal.Temp.Pizza." + br.readLine());
                Object o = aClass.getConstructor().newInstance();
                if(o instanceof Pizza){
                    ((Pizza) o).prepare();
                    ((Pizza) o).bake();
                    ((Pizza) o).cut();
                    ((Pizza) o).send();
                }
            } catch (ClassNotFoundException | IOException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                System.out.println("你确定你打了披萨名字？");
                break;
            }

        }while (true);
    }
}
