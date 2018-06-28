package pattern.template;

public class Coffe extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("필터로 커피를 우려낸다.");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕을 추가한다.");
    }
}
