package Rooms;

import Hotel.People.Guest;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, RoomType.DOUBLE);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canAddAndRemoveGuest(){
        Guest guest = new Guest("Niall");
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.countGuests());
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void canChangeRoomType(){
        bedroom.setRoomType(RoomType.SINGLE);
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void cannotAddGuestIfRoomFull(){
        bedroom.setRoomType(RoomType.SINGLE);
        Guest guest = new Guest("Niall");
        assertTrue(bedroom.addGuest(guest));
        assertFalse(bedroom.addGuest(guest));
    }
}
