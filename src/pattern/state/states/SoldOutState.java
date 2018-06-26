package pattern.state.states;

import pattern.state.GumballMachine;
import pattern.state.State;

/**
 * 매진 상태 클래스
 */
public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("상품이 매진 되었습니다.");
    }

    @Override
    public void ejectQuater() {
        System.out.println("상품이 매진 되었습니다.");
    }

    @Override
    public void tumCrank() {
        System.out.println("상품이 매진 되었습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("상품이 나갈 수 없습니다..");
    }
}
