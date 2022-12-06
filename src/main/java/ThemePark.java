import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;


import java.util.ArrayList;

public class ThemePark {


    private ArrayList<IReviewed> reviewedAttractions; // Create an instance variable called reviewedAttractions

    public ThemePark(ArrayList<IReviewed> reviewedAttractions) {  // Pass the arraylist to the constructor
        this.reviewedAttractions = reviewedAttractions;
    }

    public ArrayList<IReviewed> getAllReviewed() {  // Create a method to return the reviewedAttractions Arraylist
        return this.reviewedAttractions;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        visitor.addAttraction(attraction);
        attraction.increaseVisitCount(visitor);
    }
}
