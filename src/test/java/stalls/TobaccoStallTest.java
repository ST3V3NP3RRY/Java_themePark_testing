package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 5);
        visitor = new Visitor(21, 1.0, 20.0);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasRating() {
        assertEquals(5, tobaccoStall.getRating());
    }

    @Test
    public void isAllowedTo_True() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void isAllowedTo_False() {
        Visitor visitor1 = new Visitor(12, 1.0, 20.0);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
    }
}
