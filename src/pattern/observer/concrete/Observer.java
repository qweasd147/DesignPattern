package pattern.observer.concrete;

public interface Observer {

    /**
     *
     * @param temperature  기온
     * @param humidity  습도
     * @param pressure  기압
     */
    void update(float temperature, float humidity, float pressure);
}
