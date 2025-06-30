package Qi.Qi_People;

import java.util.ArrayList;
import java.util.List;

class QPeople {
    private static int ID;
    private static String name;
    private static String email;

    public QPeople(int ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
    }

    public static int getID() {
        return ID;
    }

    public static String getName() {
        return name;
    }

    public static String getEmail() {
        return email;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
     * @param   ID                The student's ID
     * @param   name              The student's name
     * @param   email             The student's email
     * @param   coursesTaken      The courses taken by the student
     * @param   courseGrades      The grades of the student's courses
     * @throws  IllegalArgumentException
     */
    public QStudent(int ID, String name, String email, List<String> coursesTaken, List<Double> courseGrades) throws IllegalArgumentException {
        super(ID, name, email);
        if (coursesTaken.size() != courseGrades.size()) {
            throw new IllegalArgumentException("coursesTaken and courseGrades cannot be different lengths.");
        }
        this.coursesTaken = coursesTaken;
        this.courseGrades = courseGrades;
    }

    public static void addCourse(String course, double grade) {
        coursesTaken.add(course);
        courseGrades.add(grade);
        System.out.println("Course added: " + course + "\nCorresponding grade added: " + grade);
    }

    public static double getAverageGrade() {
        double total = 0;
        for (double grade : courseGrades) {
            total += grade;
        }
        return total / courseGrades.size();
    }

    public static
}

class QTeacher extends QPeople{

}