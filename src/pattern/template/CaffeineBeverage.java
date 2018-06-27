package pattern.template;

/**
 * 카페인 음료 만들기
 */
public abstract class CaffeineBeverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 차 or 티백(teabag)을 우려낸다.
     */
    abstract void brew();

    /**
     * 필요한 첨가물을 넣는다.
     */
    abstract void addCondiments();

    /**
     * 물을 끌인다.
     */
    void boilWater(){

    }

    /**
     * 컵에 옮겨 담는다.
     */
    void pourInCup(){

    }
}
