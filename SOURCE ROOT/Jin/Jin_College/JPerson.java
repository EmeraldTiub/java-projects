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

class JStudent extends JPerson {
    // Create the course info.
    public static String[] courseNames = new String[30];
    public static double[] courseGrades = new double[30];
    public static int courseIdx;

    /**
     * Constructs a JStudent object with the provided course information and personal details.
     *
     * @param courseNames the array of course names the student has taken
     * @param courseGrades the array of grades corresponding to the courses taken
     * @param id the unique identifier for the student, must be 9 digits long
     * @param email the email address of the student
     * @param firstName the first name of the student
     * @param lastName the last name of the student
     * @throws IllegalArgumentException if the student ID is not valid (not 9 digits),
     *         or if the course names and grades arrays do not have the same length,
     *         or if the number of courses exceeds 30
     */
    public JStudent(String[] courseNames, double[] courseGrades, String id, String email, String firstName, String lastName) {
        super(id, email, firstName, lastName);
        if (!validID(id)) {
            throw new IllegalArgumentException("The ID for a student must be 9 digits long.");
        }
        if (courseNames.length != courseGrades.length) {
            throw new IllegalArgumentException("The array courseGrades must be the same length as courseNames.");
        }
        if (courseNames.length > 30) {
            throw new IllegalArgumentException("The amount of courses taken cannot be bigger than 30.");
        }

        for (int i = 0; i < courseNames.length; i++) this.courseNames[i] = courseNames[i];
        for (int i = 0; i < courseGrades.length; i++) this.courseGrades[i] = courseGrades[i];
        this.courseIdx = courseNames.length;
    }

    /**
     * Checks if the given ID is a valid student ID.
     * A valid ID must be exactly 9 digits long.
     *
     * @param id the ID string to be validated
     * @return true if the ID is exactly 9 digits long, false otherwise
     */
    public boolean validID(String id) {
        // Check if the length is wrong.
        if (id.length() != 9) {
            return false;
        }
        // Check if the entire ID is digits.
        for (int i = 0; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Adds a course and its grade to the list of courses taken by the student.
     * If the maximum limit of 30 courses is reached, the method exits without adding the course.
     *
     * @param courseName the name of the course to be added
     * @param courseGrade the grade associated with the course to be added
     */
    public static void addCourse(String courseName, double courseGrade) {
        courseNames[courseIdx] = courseName;
        courseGrades[courseIdx] = courseGrade;
        courseIdx++;
    }

    /**
     * Retrieves all courses taken by the student, formatted as a string.
     *
     * @return a string with all course names taken by the student
     */
    public String getCourses() {
        String res = "Courses taken: ";
        for (int i = 0; i < courseNames.length; i++) {
            res += courseNames[i] + " | ";
        }
        return res;
    }

    /**
     * Retrieves all grades of the courses taken by the student, formatted as a string.
     *
     * @return a string containing all course grades taken by the student
     */
    public String getGrades() {
        String res = "Grades: ";
        for (int i = 0; i < courseGrades.length; i++) {
            res += courseGrades[i] + " | ";
        }
        return res;
    }

    /**
     * Returns a string representation of the student, including their full name,
     * student ID, and email address.
     *
     * @return a string representation of the student's details
     */
    public String toString() {
        String res = "+————————————————————————————+\n| Course Name | Course Grade |\n";
        res += "|—————————————|——————————————|\n";
        for (int i = 0; i < courseNames.length; i++) {
            if (courseNames[i] == null) break;
            // Formatting for the string.
            String spaces = "";
            int spacesNeeded = 13 - courseNames[i].length();
            for (int j = 0; j < spacesNeeded - 1; j++) {
                spaces += " ";
            }
            // Add the course to the string.
            res += "| " + courseNames[i] + spaces + "|";

            spaces = "";
            spacesNeeded = 13 - ("" + courseGrades[i]).length();
            for (int j = 0; j < spacesNeeded - 1; j++) {
                spaces += " ";
            }
            res += " " + courseGrades[i] + "%" + spaces + "|\n";
        }
        res += "+————————————————————————————+";
        return res;
    }

    /**
     * Calculates the average grade of all courses taken by the student.
     *
     * @return the average grade of the courses,
     */
    public double gradeAvg() {
        double gradeSum = 0.0;
        for (int i = 0; i < courseGrades.length; i++) {
            gradeSum += courseGrades[i];
        }
        return gradeSum / courseGrades.length;
    }

    /**
     * Creates a list of courses and grades for a student
     * Then creates a JStudent object with these details
     * along with personal information, and then modifies
     * the student's courses.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        String[] courseNames = {"PHYS& 121", "ITAL& 121", "CSC 143", "CHEM 256", "ENGL& 235"};
        double[] courseGrades = {100.0, 98.4, 99.6, 98.2, 97.8};
        JStudent student = new JStudent(
                courseNames,
                courseGrades,
                "203614261",
                "yunjin.li@seattlecolleges.edu",
                "Yunjin",
                "Li");
        System.out.println(student);
        student.addCourse("NUTR& 101", 98.0);
        System.out.println("Added NUTR& 101 course with grade of 98.0%");
        System.out.println(student);

        // Test the case where the user inputs two arrays with unequal length.
        // Take the code out of the comments to run.
//        String[] tooManyCourseNames = {"test"};
//        student = new JStudent(
//                tooManyCourseNames,
//                courseGrades,
//                "203614261",
//                "yunjin.li@seattlecolleges.edu",
//                "Yunjin",
//                "Li");

        // Test the case where the user inputs an invalid amount of courses and grades.
        // Take the code out of the comments to run.
//        String[] overLimitCourseNames = {"test","test","test","test",
//                "test","test","test","test","test","test","test",
//                "test","test","test","test","test","test","test",
//                "test","test","test","test","test","test","test",
//                "test","test","test","test","test","test"};
//        double[] overLimitCourseGrades = {50.0,50.0,50.0,50.0,50.0,
//                50.0,50.0,50.0,50.0,50.0,50.0,50.0,50.0,50.0,50.0,
//                50.0,50.0,50.0,50.0,50.0,50.0,50.0,50.0,50.0,50.0,
//                50.0,50.0,50.0,50.0,50.0,50.0};
//        System.out.println(overLimitCourseGrades.length);
//        System.out.println(overLimitCourseNames.length);
//        student = new JStudent(overLimitCourseNames,overLimitCourseGrades,"203614261","yunjin.li@seattlecolleges.edu","Yunjin","Li");

        // Test the case where the user inputs an invalid ID both ways (letters included, or length is invalid)
        String invalidID = "a";
//        student = new JStudent(courseNames, courseGrades, invalidID, "yunjin.li@seattlecolleges.edu", "Yunjin", "Li");
        invalidID = "20361426a"; // Correct length, but JStudent should say "Hey, that's not right! You gotta give me all numbers!";
//        student = new JStudent(courseNames, courseGrades, invalidID, "yunjin.li@seattlecolleges.edu", "A", "A"); // Example names.

        // Uncomment any one of the commented code lines to run it.
    }
}

class JTeacher extends JPerson {
    // Create the variables for a teacher.
    public static String id;
    public static String firstName;
    public static String lastName;
    public static String email;
    public static String[] coursesTaught = new String[4];
    public static int courseIdx;

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
