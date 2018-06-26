package pattern.state.states;

import pattern.state.GumballMachine;
import pattern.state.State;

/**
 * 동전이 있는 상태 클래스
 */
public class HasQuarterState implements State{

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("동전은 한 개만 넣어주세요.");

    }

    @Override
    public void ejectQuater() {
        System.out.println("동전이 반환됩니다.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void tumCrank() {
        System.out.println("손잡이를 돌렸습니다.");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("상품이 나갈 수 없습니다.");
    }
}
