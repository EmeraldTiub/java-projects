package Jin.JinRectangle;

import javax.swing.*;
import java.awt.*;

public class JRectangle extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics g2d = (Graphics) g;
        g2d.setColor(Color.BLUE);
        g2d.fillRect(60, 50, 45, 90);
        Font font = new Font("Arial", Font.BOLD, 12);
        g2d.setFont(font);
        g2d.drawString("HELLO BILL", 7, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle Drawing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JRectangle());
        frame.setSize(400, 600);
        frame.setVisible(true);
    }
}