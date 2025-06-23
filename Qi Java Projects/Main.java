import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    /**
     * Read through the student info lines and record the info in a list full of Student objects.
     *
     * @param studentsFile The file with all the students' details.
     * @return A list of Student objects.
     *
     * @throws IllegalArgumentException if any pre-condition is violated
     * @throws FileNotFoundException if {@code studentsFile} cannot be opened
     * @throws NumberFormatException if the first line or a GPA field cannot be parsed
     */
    public static Student[] readData(File studentsFile) throws FileNotFoundException {

        // Preconditions for the student file
        if (studentsFile == null || studentsFile.length() == 0) {
            throw new IllegalArgumentException("studentsFile must not be null or empty");
        }
        if (!studentsFile.isFile() || !studentsFile.canRead()) {
            throw new IllegalArgumentException("studentsFile must exist and be readable: " + studentsFile.getPath());
        }

        // Now reading the file.
        try (Scanner scanner = new Scanner(studentsFile)) { // Automatically close the scanner if there’s an error
            int studentCount = Integer.parseInt(scanner.nextLine().trim());
            if (studentCount < 0) {
                throw new IllegalArgumentException("Student record count cannot be negative");
            }

            Student[] students = new Student[studentCount];
            scanner.nextLine(); // skip csv header

            for (int i = 0; i < studentCount; i++) {
                if (!scanner.hasNextLine()) {
                    throw new IllegalArgumentException("File ended early: expected " + studentCount + " data lines");
                }
                String[] fields = scanner.nextLine().split(",");
                if (fields.length != 5) {
                    throw new IllegalArgumentException("Line " + (i + 3) + " does not have the required 5 fields");
                }

                String id = fields[0];
                String firstName = fields[1];
                String lastName = fields[2];
                String email = fields[3];
                double gpa = Double.parseDouble(fields[4]);

                students[i] = new Student(id, firstName, lastName, email, gpa);
            }
            return students;
        }
    }


    /**
     * Calculate the average GPA
     *
     * @param students The list of Student objects
     * @return The average GPA of the students
     */
    public static double calculateAverageGpa(Student[] students) {
        double sum = 0.0;
        for (Student s : students) {
            sum += s.getGpa();
        }
        return sum / students.length;
    }

    /**
     * Finds the shortest first name out of all the students' first names.
     *
     * @param students The list of Student objects
     * @return One of the (or the only one) shortest first name out of all the students
     */
    public static String findShortestFirstName(Student[] students) {
        // Uses simpler logic than before.
        String shortest = students[0].getFirstName();
        for (Student s : students) {
            if (s.getFirstName().length() < shortest.length()) {
                shortest = s.getFirstName();
            }
        }
        return shortest;
    }

    /**
     * Prints the results (First student, last student, shortest first name, and average GPA)
     *
     * @param args Command-line arguments. Not used here.
     */
    public static void main(String[] args) {
        // Get the CSV file of students.
        File studentFile = new File("StudentData.csv");

        // Read in student data from studentFile and handle the case if the file doesn't exist
        Student[] students = null;
        try {
            students = readData(studentFile);
        } catch (FileNotFoundException e) {
            System.err.println("The StudentData.csv file was not found in the current directory.");
            System.err.println("Please make sure it is in the same directory as this script.");

            // Just do a graceful exit with `return` here.
            return;
        }

        // Print the results
        if (students.length == 0) {
            System.out.println("No student data found in StudentData.csv. Exiting...");
            return;
        }
        System.out.println("First student: " + students[0].toString());

        System.out.println("Last student: " + students[students.length - 1].toString());

        System.out.println("Shortest first name: " + findShortestFirstName(students));

        // Just use printf here instead of DecimalFormat
        System.out.printf("Average GPA: %.1f%n", calculateAverageGpa(students));
        System.out.println("hello");
    }
}
