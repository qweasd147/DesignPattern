package pattern.state;

import pattern.state.states.HasQuarterState;
import pattern.state.states.NoQuarterState;
import pattern.state.states.SoldOutState;
import pattern.state.states.SoldState;

public class GumballMachine {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State nowState = soldOutState;
    private int productCount = 0;

    public GumballMachine(int productCount){

        this.productCount = productCount;

        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        if(productCount>0)  nowState = noQuarterState;
        else                nowState = soldOutState;
    }

    public void insertQuarter(){
        nowState.insertQuater();
    }

    public void ejectQuarter(){
        nowState.ejectQuater();
    }

    public void turnCrank(){
        nowState.tumCrank();
        nowState.dispense();
    }

    public void setState(State state){
        this.nowState = state;
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if (productCount != 0){
            productCount = productCount - 1;
        }
    }

    public int getProductCount() {
        return productCount;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }
}
