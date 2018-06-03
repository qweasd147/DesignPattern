package pattern.factory.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dought;
    protected String sauce;
    protected List<String> toppings = new ArrayList<String>();

    /**
     * pizza 준비
     */
    protected void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings");

        for(int i=0;i<toppings.size();i++){
            System.out.println(" "+toppings.get(i));
        }
    }

    protected void bake(){
        System.out.println("350도에 25 분 동안 굽는다.");
    }

    protected void cut(){
        System.out.println("피자를 대각선으로 자른다.");
    }

    protected void box(){
        System.out.println("피자를 박스에 옮겨 담는다.");
    }

    public String getName(){
        return name;
    }
}
