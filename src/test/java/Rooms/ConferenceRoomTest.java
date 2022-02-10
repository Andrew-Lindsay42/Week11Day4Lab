package Rooms;

import Hotel.Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Ballroom", 50);
    }
    
    @Test
    public void hasName(){
        assertEquals("Ballroom", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, conferenceRoom.countGuests());
    }
}
