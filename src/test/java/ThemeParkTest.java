import attractions.Dodgems;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    Dodgems dodgems;
    RollerCoaster rollercoaster;
    IceCreamStall iceCreamStall;
    Visitor visitor;

    ThemePark themePark;


    @Before
    public void before() {
        dodgems = new Dodgems("Dodgems", 5);
        rollercoaster = new RollerCoaster("The Screamer", 10);
        iceCreamStall = new IceCreamStall("Mr Whippy", "James Smith", ParkingSpot.A1, 4);
        visitor = new Visitor(12, 145.3, 20.00);
    }

    @Test
    public void getAllReviewedAttractions() {
        ArrayList<IReviewed> attractions = new ArrayList<>();  // Make an empty ArrayList<IReviewed>
        attractions.add(dodgems);
        attractions.add(rollercoaster);
        attractions.add(iceCreamStall);
        ThemePark adventureLand = new ThemePark(attractions);  // Add attractions and then pass them into instance of themePark
        assertEquals(attractions, adventureLand.getAllReviewed());  //Should get Arraylist of attractions back when we call getAllReviewed
    }

    @Test
    public void addVisit() {
        ArrayList<IReviewed> attractions = new ArrayList<>();
        attractions.add(dodgems);
        attractions.add(rollercoaster);
        attractions.add(iceCreamStall);
        ThemePark wonderLand = new ThemePark(attractions);

        wonderLand.visit(visitor, rollercoaster);
        assertEquals(1, visitor.countVisitedAttractions());
        assertEquals(1, rollercoaster.getVisitCount());
    }
}
