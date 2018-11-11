package pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Planner {

    private int day = 0;
    private List<String> hotels;
    private List<String> tickets;

    private Planner(){}

    private Planner(Builder builder){
        this.day = builder.day;
        this.hotels = builder.hotels;
        this.tickets = builder.tickets;
    }

    public void handlePlan(){
        //TODO : handle plan
        String _toString =
                "Planner{" +
                    "day=" + day +
                    ", hotels=" + hotels +
                    ", tickets=" + tickets +
                '}';

        System.out.println(_toString);
    }

    public static class Builder {
        private int day = 0;
        private List<String> hotels = new ArrayList<>();
        private List<String> tickets = new ArrayList<>();

        public Builder setDay(int day) {
            this.day = day;
            return this;
        }

        public Builder addHotels(String hotel) {
            hotels.add(hotel);
            return this;
        }

        public Builder addTickets(String ticket) {
            tickets.add(ticket);
            return this;
        }

        public Planner build(){
            return new Planner(this);
        }
    }


}
