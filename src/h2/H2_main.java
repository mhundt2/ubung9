package h2;

public class H2_main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Passenger p = new Passenger("Mustermann", 3, true);
        bus.enterBus(p);
    }
}
