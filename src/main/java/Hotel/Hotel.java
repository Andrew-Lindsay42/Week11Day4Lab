package Hotel;

import Hotel.Bookings.BedroomBooking;
import Hotel.People.Guest;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.DiningRoom;
import Hotel.Rooms.Room;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<BedroomBooking> bookings;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.diningRooms = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int countBedrooms() {
        return bedrooms.size();
    }

    public int countConferenceRooms() {
        return conferenceRooms.size();
    }

    public int countDiningRooms(){
        return diningRooms.size();
    }

    public void createRoom(Bedroom bedroom){
        bedrooms.add(bedroom);
    }

    public void createRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.add(conferenceRoom);
    }

    public void createRoom(DiningRoom diningRoom){
        diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public void demolishRoom(Bedroom bedroom){
        bedrooms.remove(bedroom);
    }

    public void demolishRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.remove(conferenceRoom);
    }

    public void demolishRoom(DiningRoom diningRoom){
        diningRooms.remove(diningRoom.getName());
    }

    public boolean checkIn(Guest guest, Room room) {
        return room.addGuest(guest);
    }

    public boolean checkOut(Guest guest, Room room) {
        return room.removeGuest(guest);
    }

    public int countBookings(){
        return bookings.size();
    }

    public BedroomBooking bookRoom(Bedroom bedroom, int nights){
        BedroomBooking booking = new BedroomBooking(bedroom, nights);
        bookings.add(booking);
        return booking;
    }
}

