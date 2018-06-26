package pattern.state;

public interface State {

    /**
     * 동전 투입
     */
    void insertQuater();

    /**
     * 동전 반환
     */
    void ejectQuater();

    /**
     * 손잡이를 돌렸을 시
     */
    void tumCrank();

    /**
     * 알맹이를 배출 시
     */
    void dispense();
}
