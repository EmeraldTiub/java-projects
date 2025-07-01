package Qi.Qi_People;

import java.util.ArrayList;
import java.util.List;

class QPeople {
    private static int ID;
    private static String name;
    private static String email;

    /**
     * Set up a QPeople object
     *
     * @param   ID      The person's ID
     * @param   name    The person's name
     * @param   email   The person's email
     */
    public QPeople(int ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
    }

    /**
     * Get the person's ID
     *
     * @return The person's ID
     */
    public static int getID() {
        return ID;
    }

    /**
     * Get the person's name
     *
     * @return The person's name
     */
    public static String getName() {
        return name;
    }

    /**
     * Get the person's email
     *
     * @return The person's email
     */
    public static String getEmail() {
        return email;
    }

    /**
     * Set the person's ID to a given ID
     *
     * @param   ID   The new ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Set the person's name to a given name
     *
     * @param   name   The new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the person's email to a given email
     *
     * @param   email   The new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Display the Person object in string format
     *
     * @return The person's ID, name, and email in a string
     */
    @Override
    public String toString() {
        return "[Person]" +
                "\nID     : " + this.ID +
                "\nName   : " + this.name +
                "\nEmail  : " + this.email;
    }
}

class QStudent extends QPeople {
    private static List<String> coursesTaken;
    private static List<Double> courseGrades;

    /**
     * Set up the QStudent object
     *
     * @param   ID                         The student's ID
     * @param   name                       The student's name
     * @param   email                      The student's email
     * @param   coursesTaken               The courses taken by the student
     * @param   courseGrades               The grades of the student's courses
     * @throws  IllegalArgumentException   When coursesTaken is not the same length as courseGrades
     */
    public QStudent(int ID, String name, String email, List<String> coursesTaken, List<Double> courseGrades) throws IllegalArgumentException {
        super(ID, name, email);
        // If there isn't enough grades to correspond to the courses (or vice versa), throw an IllegalArgumentException
        if (coursesTaken.size() != courseGrades.size()) {
            throw new IllegalArgumentException("coursesTaken and courseGrades must be the same length.");
        }
        this.coursesTaken = coursesTaken;
        this.courseGrades = courseGrades;
    }

    /**
     * Add a course the student took, and the grade received for the course, to coursesTaken and courseGrades, respectively
     *
     * @param   course    The course the student took
     * @param   grade     The grade the student received for the course
     */
    public static void addCourse(String course, double grade) {
        coursesTaken.add(course);
        courseGrades.add(grade);
        System.out.println("Course added: " + course + "\nCorresponding grade added: " + grade);
    }

    /**
     * Get the overall grade average of the student
     *
     * @return The student's average grade
     */
    public static double getAverageGrade() {
        double total = 0;
        for (double grade : courseGrades) {
            total += grade;
        }
        return total / courseGrades.size();
    }

    /**
     * Get the all courses the student took
     *
     * @return A string showing the courses in the format: Course, course, course, ..., course
     */
    public static String getCoursesTaken() {
        String courses = "";
        for (String course : coursesTaken) {
            courses += course + ", ";
        }
        return courses;
    }

    /**
     * Get the grades the student received from the courses they took
     *
     * @return A string showing the grades in the format: Grade, grade, ..., grade
     */
    public static String getCourseGrades() {
        String courses = "";
        for (double grade : courseGrades) {
            courses += grade + ", ";
        }
        return courses;
    }

    /**
     * Set the list of courses taken to a given list
     *
     * @param    coursesTaken    The courses the student took
     */
    public void setCoursesTaken(List<String> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    /**
     * Set the list of corresponding grades taken to a given list
     *
     * @param    courseGrades    The grades of the courses taken
     */
    public void setCourseGrades(List<Double> courseGrades) {
        this.courseGrades = courseGrades;
    }

    /**
     * The main() function to test the other methods
     *
     * @param   args   Command-line arguments. Not used here.
     */
    public static void main(String[] args) {
        // Add the courses the student took
        List<String> courses = new ArrayList<>();
        courses.add("CSC 143");
        courses.add("MATH& 151");

        // Add the corresponding grades
        List<Double> grades = new ArrayList<>();
        grades.add(100.00);
        grades.add(104.00);
        QStudent student = new QStudent(203082220, "yunqi", "yxli13@students.everettcc.edu", courses, grades);

        // since QStudent extends to QPeople, and QPeople has a toString() method, this line runs that one
        System.out.println(student);
    }
}

class QTeacher extends QPeople{
    private static List<String> coursesTaught;

    /**
     * Set up the QTeacher object
     *
     * @param    ID               The teacher's ID
     * @param    name             The teacher's name
     * @param    email            The teacher's email
     * @param    coursesTaught    The courses the teacher taught
     */
    public QTeacher(int ID, String name, String email, List<String> coursesTaught) {
        super(ID, name, email);
        this.coursesTaught = coursesTaught;
    }

    /**
     * Add a course to coursesTaught
     *
     * @param   course   The new course taught
     */
    public static void addCourse(String course) {
        coursesTaught.add(course);
    }

    /**
     * Access the list of courses taught and print it out in string format
     *
     * @return A list of courses taught in the format: Course, course, course, ..., course
     */
    public static String getCoursesTaught() {
        String courses = "";

        // Loop through the coursesTaught list and add each of them to a string
        for (String course : coursesTaught) {
            courses += course + ", ";
        }
        return courses;
    }

    /**
     * Set the list of courses taught to another list of courses
     *
     * @param   coursesTaught   The new list of courses taught
     */
    public void setCoursesTaught(List<String> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    /**
     * The main() function to test the other methods
     *
     * @param   args   Command-line arguments. Not used here.
     */
    public static void main(String[] args) {
        // Add the courses the teacher taught
        List<String> courses = new ArrayList<>();
        courses.add("CSC 142");
        courses.add("MATH& 123");

        QTeacher teacher = new QTeacher(123456, "sdf", "sdf@gmail.com", courses);

        // since QTeacher extends to QPeople, and QPeople has a toString() method, this line runs that one
        System.out.println(teacher);
    }
}