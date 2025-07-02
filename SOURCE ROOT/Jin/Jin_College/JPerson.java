package Jin.Jin_College;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

class JPerson implements Interface {
    // Create the info for the person.
    public static String id;
    public static String firstName;
    public static String lastName;
    public static String email;

    /**
     * Writes the provided content to a file named "file.txt".
     *
     * @param content an array of strings, each representing a line to be written to the file
     * @return true if the file is successfully written
     * @throws FileNotFoundException if the file cannot be created or opened for writing
     */
    @Override
    public boolean writeFile(String[] content) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("file.txt");
        for (int i = 0; i < content.length; i++) {
            writer.println(content[i]);
        }
        writer.close();
        return true;
    }

    /**
     * Reads the content of a file and updates the variables (ID, first name, last name, and email) with
     * the values read from the file. Each line in the file represents one variable in the order: ID, first name,
     * last name, and email.
     *
     * @param file the file to be read, containing the person's details
     * @return true if the file is successfully read
     * @throws FileNotFoundException if the specified file does not exist or cannot be opened
     */
    @Override
    public boolean readFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        setId(scanner.nextLine());
        setFirstName(scanner.nextLine());
        setLastName(scanner.nextLine());
        setEmail(scanner.nextLine());
        return true;
    }

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
     * Makes a JPerson class and uses operations such as creating a person, writing data to
     * a file, reading data from a file, and displaying the details of the person.
     *
     * @param args command-line arguments
     * @throws FileNotFoundException if the file cannot be found during read or write operations
     */
    public static void main(String[] args) throws FileNotFoundException {
        JPerson person = new JPerson("203614261", "Yunjin", "Li", "jin.cminst@gmail.com");
        System.out.println(person);

        // Write the file
        String[] content = {"123456789", "John", "Doe"};
        person.writeFile(content);
        System.out.println("File written successfully.");

        // Read the file
        File file = new File("file.txt");
        try {
            person.readFile(file);
        } catch (NoSuchElementException e) {
            System.out.println("The file had " + content.length + " but expected 4 lines of text. Exiting...");
            return;
        }

        // Display the person's info.
        System.out.println(person.id);
        System.out.println(person.firstName);
        System.out.println(person.lastName);
        System.out.println(person.email);
    }

}


