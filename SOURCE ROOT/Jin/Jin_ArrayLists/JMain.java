package Jin.Jin_ArrayLists;

import java.util.ArrayList;

public class JMain {
    /**
     * Compares two JPerson objects based on their age.
     *
     * @param person1 the first person to compare
     * @param person2 the second person to compare
     * @return a negative integer, zero, or a positive integer if the age of the first person
     *         is less than, equal to, or greater than the age of the second person
     */
    public static int compare(JPerson person1, JPerson person2) {
        return person1.getAge() - person2.getAge();
    }
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

        // Sort it with the compare() method
        people.sort(JMain::compare);
        for (JPerson person : people) {
            // Print out each person's info.
            System.out.println(person);
        }
    }
}
