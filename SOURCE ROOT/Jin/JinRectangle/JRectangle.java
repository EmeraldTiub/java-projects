package Jin.JinRectangle;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class JRectangle extends JPanel {
    // Set the variables with no value.
    private String name;
    private int width;
    private int height;

    public JRectangle(String name, int w, int h) {
        this.name = name;
        this.width = w;
        this.height = h;
    }

    /**
     * Draw the rectangle and text.
     * @param g the Graphics object
     */
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        // Start the graphics.
        Graphics2D g2d = (Graphics2D) g;

        // Set up the rectangle and text.
        g2d.setColor(Color.BLUE);
        g2d.fillRect(60, 50, width, height);
        Font font = new Font("Arial", Font.BOLD, 12);

        // Smooth out the jagged edges of text.
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        // Draw the text.
        g2d.setFont(font);
        g2d.drawString("HELLO " + name.toUpperCase(), 7, 20);
    }

    /**
     * Ask the user for their name, the rectangle width, and the rectangle height.
     * Then starts up the frame.
     * @param args
     */
    public static void main(String[] args) {
        // Ask the user to put in the name, rectangle width, and rectangle height.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        // Keep prompting the user if they type more than one word.
        while (name.contains(" ")) {
            System.out.println("Please type one word. Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Enter rectangle width: ");
        Integer width = Integer.parseInt(scanner.nextLine());
        // Keep prompting the user if they make the rectangle width out of the range of 1..100
        while (width < 1 || width > 100) {
            System.out.println("Please type a number in the range of 1..100. Enter rectangle width: ");
            width = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Enter rectangle height: ");
        Integer height = Integer.parseInt(scanner.next());
        // Keep prompting the user if they make the rectangle height out of the range of 1..100
        while (height < 1 || height > 100) {
            System.out.println("Please type a number in the range of 1..100. Enter rectangle height: ");
            height = Integer.parseInt(scanner.next());
        }

        // Close the scanner.
        scanner.close();

        // Make the frame.
        JFrame frame = new JFrame("Rectangle With Name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set name, width, and height to the values that the user put in.
        frame.add(new JRectangle(name, width, height));

        // Make the frame visible and set the size.
        frame.setSize(400, 600);
        frame.setVisible(true);
    }
}