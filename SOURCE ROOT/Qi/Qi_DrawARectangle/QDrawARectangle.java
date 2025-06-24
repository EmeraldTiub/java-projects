package Qi.Qi_DrawARectangle;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class QDrawARectangle extends JPanel {
    static String name = "BILL";
    static int width = 1;
    static int height = 1;

    /*
     * Prompts the user for name and the height and width of the rectangle to be drawn in the graphics window
     *
     * @return Nothing. Just updates the global variables.
     */
    public static void prompt() {
        Scanner scan = new Scanner(System.in); // Set up the scanner to see the text in the console

        // Prompt the user for their name
        System.out.println("What is your name? ");
        name = scan.nextLine();
        while (name.contains(" ")) { // As long as the user includes a space (input includes more than one word), keep prompting
            System.out.println("Cannot enter more than one word.");
            System.out.println("What is your name? ");
            name = scan.nextLine();
        }

        // Prompt the user for the width of the rectangle
        System.out.println("Width of the rectangle: ");
        width = Integer.parseInt(scan.nextLine());

        while (width > 100 || width < 1) { // As long as the user doesn't input a valid width, keep prompting
            System.out.println("Width has to be within 1 and 100.");
            System.out.println("Width of the rectangle: ");
            width = Integer.parseInt(scan.nextLine());
        }

        // Prompt the user for the height of the rectangle
        System.out.println("Height of the rectangle: ");
        height = Integer.parseInt(scan.nextLine()); // Don't need to make a new variable here, just update global variable

        while (height > 100 || height < 1) { // As long as the user doesn't put in a valid response, keep prompting.
            System.out.println("Height has to be within 1 and 100.");
            System.out.println("Height of the rectangle: ");
            height = Integer.parseInt(scan.nextLine());
        }

        scan.close(); // Close the scanner
    }


    /*
     * Draws the text saying "HELLO [name]" and a rectangle with the given width and height
     *
     * @param Graphics object The main tool used to draw with
     * @return Creates text and a rectangle on the graphics screen
     */
    @Override
    protected void paintComponent(Graphics g) {
        // Sets up basic drawing tools
        super.paintComponent(g);
        Graphics g2d = (Graphics) g;

        // Create the rectangle
        g2d.setColor(Color.BLUE);
        g2d.fillRect(60, 50, width, height);

        // Add in the text saying "HELLO [name]"
        Font font = new Font("Arial", Font.BOLD, 12);
        g2d.setFont(font);
        g2d.drawString("HELLO " + name, 7, 20);
    }

    /*
     * Runs the prompt() function to get the name, height, and width. Then sets up the screen to paint on.
     *
     * @param Command-line arguments.
     * @returns Nothing.
     */
    public static void main(String[] args) {
        // Run the function to get name of user and width and height of rectangle
        prompt();

        // Sets up window to draw on
        JFrame frame = new JFrame("Draw a Rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This means that when the window is closed, the program will stop running
        frame.add(new QDrawARectangle()); // Adds a new instance of QDrawARectangle to the JFrame. This makes added objects visible.
        frame.setSize(230, 250); // Sets the size of the window
        frame.setVisible(true); // Makes the window visible
    }
}