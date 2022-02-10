package Hotel.People;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Niall");
    }

    @Test
    public void hasName(){
        assertEquals("Niall", guest.getName());
    }
}
