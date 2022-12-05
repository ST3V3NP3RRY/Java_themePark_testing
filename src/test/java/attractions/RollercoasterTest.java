package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(13, 146, 20.00);
    }



    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedTo_True() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }
    @Test
    public void isAllowedTo_False() {
        Visitor visitor = new Visitor(18, 134, 20.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void getDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void chargeDoubleIfVisitorOver200_true() {
        Visitor visitor1 = new Visitor(13, 201, 20.00);
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0.0);
    }

    @Test
    public void chargeDoubleIfVisitorOver200_false() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.0);
    }
}
