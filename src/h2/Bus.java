package h2;

import java.util.ArrayList;
import java.util.Iterator;

public class Bus {
    public ArrayList<Passenger> passengers;

    public Bus() {
        this.passengers = new ArrayList<>();
    }

    public void enterBus(Passenger p) {
        passengers.add(p);
    }

    private void exitBus() {
        Iterator<Passenger> iterator = passengers.iterator();
        while (iterator.hasNext()) {
            Passenger p = iterator.next();
            if (p.planned == p.visited) {
                iterator.remove();
            }
        }
    }

    public void nextStop(Passenger[] boarding) {
        for (Passenger p : passengers) {
            p.visited++;
        }
        exitBus();
        for (Passenger p : boarding) {
            passengers.add(p);
        }
    }

    public void nextStop() {
        for (Passenger p : passengers) {
            p.visited++;
        }
        exitBus();
    }

    public ArrayList<Passenger> findPassengersWithoutTickets() {
        ArrayList<Passenger> removed = new ArrayList<>();
        Iterator<Passenger> iterator = passengers.iterator();
        while (iterator.hasNext()) {
            Passenger p = iterator.next();
            if (!p.ticket) {
                removed.add(p);
                iterator.remove();
            }
        }
        return removed;
    }

    public void transferPassengers(Bus otherBus, String[] passengerNames) {
        for (String name : passengerNames) {
            Iterator<Passenger> iterator = passengers.iterator();
            while (iterator.hasNext()) {
                Passenger p = iterator.next();
                if (p.name.equals(name)) {
                    otherBus.enterBus(p);
                    iterator.remove();
                    break;
                }
            }
        }
    }
}