package Jin.Jin_College;

import Jin.Jin_College.JPerson;

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