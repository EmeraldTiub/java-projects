package Jin.Jin_College;

import Jin.Jin_College.JPerson;

import java.io.File;
import java.io.FileNotFoundException;

class JTeacher extends JPerson {
    // Create the variables for a teacher.
    public static String id;
    public static String firstName;
    public static String lastName;
    public static String email;
    public static String[] coursesTaught = new String[4];
    public static int courseIdx;

    public boolean readFile(File file) throws FileNotFoundException {
        return false;
    }
    public boolean writeFile(File file) throws FileNotFoundException {
        return false;
    }

    /**
     * Constructs a new JTeacher object with the specified ID, first name, courses taught,
     * last name, and email address. This class represents a teacher, extending the
     * functionality of the JPerson class.
     *
     * @param id the unique identifier for the teacher
     * @param firstName the first name of the teacher
     * @param coursesTaught a list of courses taught by the teacher
     * @param lastName the last name of the teacher
     * @param email the email address of the teacher
     */
    public JTeacher(String id, String firstName, String lastName, String[] coursesTaught, String email) {
        super(id, firstName, lastName, email);
        if (!validID(id)) {
            throw new IllegalArgumentException("The ID for a teacher must be 6 alphanumeric characters.");
        }
        if (coursesTaught.length > 4) {
            throw new IllegalArgumentException("A teacher can only teach 4 courses per term.");
        }
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        for (int i = 0; i < coursesTaught.length; i++) this.coursesTaught[i] = coursesTaught[i];
        this.email = email;
    }

    /**
     * Validates whether the given ID is valid.
     * The ID must be exactly 6 characters long and consist only of
     * alphanumeric characters (letters and digits).
     *
     * @param id the ID to be validated
     * @return true if the ID is 6 characters long and contains only
     *         alphanumeric characters, false otherwise
     */
    public boolean validID(String id) {
        // Check if the length is wrong.
        if (id.length() != 6) {
            return false;
        }
        // Check if the entire ID is digits and letters.
        for (int i = 0; i < id.length(); i++) {
            boolean isDigit = Character.isDigit(id.charAt(i));
            boolean isAlpha = Character.isAlphabetic(id.charAt(i));
            if (!isDigit && !isAlpha) {
                return false;
            }
        }
        return true;
    }

    /**
     * Retrieves a string representation of the courses taught by the teacher.
     *
     * @return a string containing the list of courses taught by the teacher
     */
    public String getClasses() {
        String res = "Courses taught: ";
        for (int i = 0; i < coursesTaught.length; i++) {
            res += coursesTaught[i] + " | ";
        }
        return res;
    }

    /**
     * Returns a formatted string representation of the courses taught by the teacher.
     * The format includes a table-like structure, where each row represents a course.
     *
     * @return a string containing a formatted table of courses taught by the teacher
     */
    public String toString() {
        String res = "+—————————————+\n| Course Name |\n";
        res += "|—————————————|\n";
        for (int i = 0; i < coursesTaught.length; i++) {
            if (coursesTaught[i] == null) break;
            // Formatting for the string.
            String spaces = "";
            int spacesNeeded = 12 - coursesTaught[i].length();
            for (int j = 0; j < spacesNeeded - 1; j++) {
                spaces += " ";
            }
            // Add the course to the string.
            res += "| " + coursesTaught[i] + spaces + " |\n";
        }
        res += "+—————————————+";
        return res;
    }

    /**
     * Adds a course to the teacher's list of courses taught
     * if the limit of four courses per term has not been
     * reached. If the limit is reached, a message is displayed.
     *
     * @param course the name of the course to be added
     */
    public static void addCourse(String course) {
        coursesTaught[courseIdx] = course;
        courseIdx += 1;
    }

    /**
     * Creates and uses a JTeacher object and includes code that
     * can be uncommented for testing invalid inputs.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        String[] coursesTaught = {"CSC 110", "CSC 142", "CSC 143"};
        JTeacher teacher = new JTeacher("A1B2C3", "Bill", "Barry", coursesTaught, "William.Barry@seattlecolleges.edu");
        System.out.println(teacher);

        String invalidId = "abcacacaca";
//        teacher = new JTeacher(invalidId, "Bill", "Barry", coursesTaught, "William.Barry@seattlecolleges.edu");

        String[] invalidCoursesTaught = {"CSC 110", "CSC 142", "CSC 143", "Test", "Test"};
//        teacher = new JTeacher("A1B2C3", "Bill", "Barry", invalidCoursesTaught, "William.Barry@seattlecolleges.edu");

        // Uncomment a line of code to run it.
    }
}
