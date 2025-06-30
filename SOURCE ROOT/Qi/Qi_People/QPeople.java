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

    public static List<String> getCoursesTaken() {
        return coursesTaken;
    }

    public static List<Double> getCourseGrades() {
        return courseGrades;
    }

    public void setCoursesTaken(List<String> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public void setCourseGrades(List<Double> courseGrades) {
        this.courseGrades = courseGrades;
    }

    @Override
    public String toString() {
        String coursesAndGrades = "";
        for (int i = 0; i < coursesTaken.size(); i++) {
            coursesAndGrades += coursesTaken.get(i) + ", " + courseGrades.get(i) + "\n";
        }
        return "[Student]" +
             "\nCourse, Grade \n" +
                coursesAndGrades;
    }

    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("CSC 143");
        courses.add("MATH& 151");
        List<Double> grades = new ArrayList<>();
        grades.add(100.00);
        grades.add(104.00);
        QStudent student = new QStudent(203082220, "yunqi", "yxli13@students.everettcc.edu", courses, grades);
        System.out.println(student);
    }
}

class QTeacher extends QPeople{
    private static List<String> coursesTaught;

    public QTeacher(int ID, String name, String email, List<String> coursesTaught) {
        super(ID, name, email);
        this.coursesTaught = coursesTaught;
    }

    public static void addCourse(String course) {
        coursesTaught.add(course);
    }

    public static List<String> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(List<String> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    @Override
    public String toString() {
        String courses = "";
        for (int i = 0; i < coursesTaught.size(); i++) {
            courses += coursesTaught.get(i) + "\n";
        }

        return "Courses Taught:\n" + courses;
    }

    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("CSC 142");
        courses.add("MATH& 123");
        QTeacher teacher = new QTeacher(123456, "sdf", "sdf@gmail.com", courses);
        System.out.println(teacher);
    }
}