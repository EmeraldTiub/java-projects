package Jin.Jin_College;

class JPerson {
    // Create the info for the person.
    public static String id;
    public static String firstName;
    public static String lastName;
    public static String email;

    /**
     * Constructs a new JPerson object with the specified ID, first name, last name, and email.
     *
     * @param id the unique identifier for the person
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @param email the email address of the person
     */
    public JPerson(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Accessor methods.

    /**
     * Retrieves the ID of the person.
     *
     * @return the ID of the person
     */
    public static String getId() {
        return id;
    }

    /**
     * Retrieves the first name of the person.
     *
     * @return the first name of the person
     */
    public static String getFirstName() {
        return firstName;
    }

    /**
     * Retrieves the last name of the person.
     *
     * @return the last name of the person
     */
    public static String getLastName() {
        return lastName;
    }

    /**
     * Retrieves the email address of the person.
     *
     * @return the email address of the person
     */
    public static String getEmail() {
        return email;
    }

    // Mutator methods.

    /**
     * Updates the ID of the person.
     *
     * @param newId the new ID to be set for the person
     */
    public static void setId(String newId) {
        id = newId;
    }

    /**
     * Updates the first name of the person.
     *
     * @param newFirstName the new first name to be set for the person
     */
    public static void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    /**
     * Updates the last name of the person.
     *
     * @param newLastName the new last name to be set for
     */
    public static void setLastName(String newLastName) {
        lastName = newLastName;
    }

    /**
     * Updates the email address of the person.
     *
     * @param newEmail the new email address to be set for the person
     */
    public static void setEmail(String newEmail) {
        email = newEmail;
    }

    /**
     * Returns a formatted string representation of the JPerson object.
     * Includes the full name, ID, and email of the person,
     * presented in a tabular layout.
     *
     * @return a string representation of the JPerson object in a formatted table
     */
    public String toString() {
        // Create variables.
        String res = "+————————————+———————————————————————————+\n";
        int firstLineLength = res.length();

        // Format the full name.
        int spacesNeeded = (firstLineLength - (firstName.length() + lastName.length())) - 18;
        String spaces = "";
        for (int i = 0; i < spacesNeeded; i++) {
            spaces += " ";
        }
        res += "| Full Name  | " + firstName + " " + lastName + spaces + "|\n";

        // Format the ID.
        spacesNeeded = (firstLineLength - id.length()) - 17;
        spaces = "";
        for (int i = 0; i < spacesNeeded; i++) {
            spaces += " ";
        }
        res += "| ID         | " + id + spaces + "|\n";

        // Format the email.
        spacesNeeded = (firstLineLength - email.length()) - 17;
        spaces = "";
        for (int i = 0; i < spacesNeeded; i++) {
            spaces += " ";
        }
        res += "| Email      | " + email + spaces + "|\n";

        // Close up the box.
        res += "+————————————+———————————————————————————+";
        return res;
    }

    /**
     * Creates a JPerson object with example info and uses the toString() method implicitly.
     *
     * @param args command-line arguments passed to the program
     */
    public static void main(String[] args) {
        JPerson person = new JPerson("203614261", "Yunjin", "Li", "jin.cminst@gmail.com");
        System.out.println(person);
    }

}


