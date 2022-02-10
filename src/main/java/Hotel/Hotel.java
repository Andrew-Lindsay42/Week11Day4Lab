package Hotel;

import Hotel.People.Guest;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.Room;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
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

//    public void createRoom(Room room){
//        if (room instanceof Bedroom){
//            bedrooms.add((Bedroom) room);
//        } else {
//            conferenceRooms.add((ConferenceRoom) room);
//        }
//    }

    public void createRoom(Bedroom bedroom){
        bedrooms.add(bedroom);
    }

    public void createRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.add(conferenceRoom);
    }

//    public void demolishRoom(Room room){
//        if (room instanceof Bedroom){
//            bedrooms.remove((Bedroom) room);
//        } else {
//            conferenceRooms.remove((ConferenceRoom) room);
//        }
//    }

    public void demolishRoom(Bedroom bedroom){
        bedrooms.remove(bedroom);
    }

    public void demolishRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.remove(conferenceRoom);
    }

    public boolean checkIn(Guest guest, Room room) {
        return room.addGuest(guest);
    }

    public boolean checkOut(Guest guest, Room room) {
        return room.removeGuest(guest);
    }
}
