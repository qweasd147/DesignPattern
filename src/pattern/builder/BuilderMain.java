package pattern.builder;

public class BuilderMain {

    public static void main(String[] args) {

        Planner.Builder builder = new Planner.Builder();

        builder.addHotels("호텔1")
                .addHotels("호텔2")
                .setDay(5);

        Planner planner = builder.build();

        planner.handlePlan();

        /*
        Planner planner2 = new Planner.Builder()
                .setDay(5)
                .addTickets("티켓1")
                .build();
        */
    }
}
