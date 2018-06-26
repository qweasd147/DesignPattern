package pattern.state.states;

import pattern.state.GumballMachine;
import pattern.state.State;

/**
 * 판매 중(처리 중)인 상태 클래스
 */
public class SoldState implements State{

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("잠깐만 기다려 주세요. 알맹이가 나가고 있습니다.");
    }

    @Override
    public void ejectQuater() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    @Override
    public void tumCrank() {
        System.out.println("손잡이는 한번만 돌려주세요");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();

        if(gumballMachine.getProductCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("상품이 더 이상 없습니다.");
            gumballMachine.setState(gumballMachine.getHasQuarterState());
        }
    }
}
