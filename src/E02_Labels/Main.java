package E02_Labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, or image, or both.

        JLabel label = new JLabel();

        Image image = new ImageIcon("icon.png").getImage();
        Image scaledImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImage);

        Border border = BorderFactory.createLineBorder(Color.green,3, true);

        label.setText("Bro, do you even code?");
        label.setIcon(icon);
        label.setHorizontalTextPosition(SwingConstants.CENTER); // SwingConstants or JLabel
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli", Font.BOLD, 20));
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(50, 50, 250, 250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setSize(420, 420);
        /*
        Sets the LayoutManager from the default (which is 'new BorderLayout()') to null. This way, it won't
        automatically vertically center and horizontally left the components. We have to specify their position and
        dimensions using the setBounds() method for each component.
        */
//        frame.setLayout(null);

        frame.add(label);

        frame.pack(); // Resizes the frame so that it fits all of its components in the window.
        frame.setVisible(true);
    }
}
