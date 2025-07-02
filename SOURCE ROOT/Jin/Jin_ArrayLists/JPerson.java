package Jin.Jin_ArrayLists;

public class JPerson{
    // Create the variables.
    private String firstName;
    private String lastName;
    private int age;

    // Create a constructor
    public JPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Accessor methods

    /**
     * Retrieves the first name of the person.
     *
     * @return the first name of the person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Retrieves the last name of the person.
     *
     * @return the last name of the person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Retrieves the age of the person.
     *
     * @return the age of the person
     */
    public int getAge() {
        return age;
    }

    // Mutator methods

    /**
     * Changes the first name of the person.
     *
     * @param firstName the new first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Changes the last name of the person.
     *
     * @param lastName the new last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Changes the age of the person.
     *
     * @param age the new age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns a string representation of the person object formatted
     * as a table with labeled rows for full name and age.
     *
     * @return the formatted string representation of the person
     */
    @Override
    public String toString() {
        // Make the top of the table.
        String res = "+————————————+————————————————————————+\n";

        // Add in the row for the full name.
        String spaces = "";
        int spacesNeeded = 22 - firstName.length() - lastName.length();
        for (int i = 0; i < spacesNeeded; i++) spaces += " ";
        res += "| Full Name  | " + firstName + " " + lastName + spaces + "|\n";

        // Add in the row for the age.
        spaces = "";
        spacesNeeded = 23 - Integer.toString(age).length();
        for (int i = 0; i < spacesNeeded; i++) spaces += " ";
        res += "| Age        | " + age + spaces + "|\n";

        // Make the bottom of the table.
        res += "+————————————+————————————————————————+";
        return res;
    }



}
