package Hotel;


import Hotel.People.Guest;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel("The Holtin");
        bedroom = new Bedroom(1, RoomType.MASTER);
        conferenceRoom = new ConferenceRoom("Ballroom", 2);
        guest = new Guest("Niall");
    }

    @Test
    public void hasName(){
        assertEquals("The Holtin", hotel.getName());
    }

    @Test
    public void canChangeName(){
        hotel.setName("The Balmoral");
        assertEquals("The Balmoral", hotel.getName());
    }

    @Test
    public void roomsStartAtZero(){
        assertEquals(0, hotel.countBedrooms());
        assertEquals(0, hotel.countConferenceRooms());
    }

    @Test
    public void canCreateRooms(){
        hotel.createRoom(bedroom);
        hotel.createRoom(bedroom);
        hotel.createRoom(conferenceRoom);
        assertEquals(2, hotel.countBedrooms());
        assertEquals(1, hotel.countConferenceRooms());
    }

    @Test
    public void canDemolishRooms(){
        hotel.createRoom(bedroom);
        hotel.createRoom(bedroom);
        hotel.demolishRoom(bedroom);
        assertEquals(1, hotel.countBedrooms());
    }
}
