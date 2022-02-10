package Hotel.Bookings;

import Hotel.Rooms.Bedroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomBookingsTest {

    BedroomBooking bedroomBooking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, Bedroom.RoomType.DOUBLE);
        bedroomBooking = new BedroomBooking(bedroom, 3);
    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom, bedroomBooking.getBedroom());
    }

    @Test
    public void hasNumberNights(){
        assertEquals(3, bedroomBooking.getNights());
    }

    @Test
    public void canReturnBill(){
        assertEquals(60.00, bedroomBooking.getBill(), 0.00);
    }

    @Test
    public void canChangeRoom(){
        Bedroom newBedroom = new Bedroom(2, Bedroom.RoomType.MASTER);
        bedroomBooking.setBedroom(newBedroom);
        assertEquals(newBedroom, bedroomBooking.getBedroom());
    }

    @Test
    public void canChangeNights(){
        bedroomBooking.setNights(4);
        assertEquals(4, bedroomBooking.getNights());
    }
}
