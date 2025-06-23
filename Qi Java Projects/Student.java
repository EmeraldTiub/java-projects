public class Student {
    // Set up variables
    private final String id;
    private String firstName;
    private String lastName;
    private String email;
    private final double gpa; // primitive now

    /**
     * Student constructor from the id, firstName, lastName, email, and gpa.
     *
     * @param id        non-null
     * @param firstName non-null
     * @param lastName  non-null
     * @param email     non-null
     * @param gpa       0.0 – 4.0 inclusive
     * @throws IllegalArgumentException if any pre-condition is violated
     */
    public Student(String id, String firstName, String lastName, String email, double gpa) {

        if (id == null || firstName == null || lastName == null || email == null) {
            throw new IllegalArgumentException("Fields cannot be null");
        }
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gpa = gpa;
    }

    /**
     * Get the ID of the student.
     * @return the ID
     */
    public String getId() {
        return id;
    }

    /**
     * Get the first name of the student.
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get the last name of the student
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Get the email address of the student
     * @return the email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Get the GPA of the student.
     * @return the GPA
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Set the first name of the student to the new first name
     * @param newFirstName The new first name
     */
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    /**
     * Set the last name of the student to the new last name
     * @param newLastName The new last name
     */
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    /**
     * Set the email of the student to the new email
     * @param newEmail The new email
     */
    public void setEmail(String newEmail) {
        email = newEmail;
    }

    /**
     * Convert the class to a string containing the info.
     * @return the string version of the class
     */
    @Override
    public String toString() {
        // So I use String format here and add an @Override
        return String.format(
                "Id = %s, First = %s, Last = %s, Email = %s, GPA = %.1f",
                id, firstName, lastName, email, gpa
        );
    }
}
