package Jin.Jin_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class JMain {
    public static void main(String[] args) {
        ArrayList<JPerson> people = new ArrayList<>();

        // Add in some people.
        people.add(new JPerson("Tom", "Brady", 47));
        people.add(new JPerson("LeBron", "James", 40));
        people.add(new JPerson("Dwayne", "Johnson", 53));
        people.add(new JPerson("Curry", "James", 37));
        people.add(new JPerson("Chris", "Hemsworth", 41));
        people.add(new JPerson("Steven", "Adams", 31));
        people.add(new JPerson("Tom", "Cruise", 63));
        people.add(new JPerson("Chris", "Pratt", 46));

        // Sort it with the JPerson.compare() method
        Collections.sort(people);
        for (JPerson person : people) {
            // Print out each person's info.
            System.out.println(person);
        }
    }
}
