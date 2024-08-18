package E03_Panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components.

        Image image = new ImageIcon("icon.png").getImage();
        Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImage);

        JLabel label = new JLabel();
        label.setText("Stoned Coder");
        label.setIcon(icon);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout()); // The default is FlowLayout().

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(700, 700);

//        redPanel.add(label);
//        bluePanel.add(label);
        greenPanel.add(label);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        frame.setVisible(true);
    }
}
