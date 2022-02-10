package Hotel.Rooms;

import Hotel.People.Guest;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int countGuests() {
        return guests.size();
    }

    public boolean addGuest(Guest guest){
        if (capacity > countGuests()) {
            return guests.add(guest);
        }
        return false;
    }

    public boolean removeGuest(Guest guest){
        return guests.remove(guest);
    }
}
