package Hotel.Rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom("Ballroom", 50);
    }

    @Test
    public void hasName(){
        assertEquals("Ballroom", diningRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, diningRoom.getCapacity());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, diningRoom.countGuests());
    }


}
