package E08_JLayeredPane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JLayeredPane = a Swing container that provides a third dimension for positioning components.
        //                e.g., depth, z-index

        JLabel label1 = new JLabel();
        label1.setBounds(0, 0, 100, 100);
        label1.setBackground(Color.red);
        label1.setOpaque(true);

        JLabel label2 = new JLabel();
        label2.setBounds(50, 50, 100, 100);
        label2.setBackground(Color.green);
        label2.setOpaque(true);

        JLabel label3 = new JLabel();
        label3.setBounds(100, 100, 100, 100);
        label3.setBackground(Color.blue);
        label3.setOpaque(true);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);

        layeredPane.add(label1, Integer.valueOf(2));
        layeredPane.add(label2, Integer.valueOf(0));
        layeredPane.add(label3, Integer.valueOf(1));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(600, 600);

        // The following doesn't work since we're adding them to a JFrame instead of a JLayeredPane.
//        frame.add(label1, Integer.valueOf(2));
//        frame.add(label2, Integer.valueOf(0));
//        frame.add(label3, Integer.valueOf(1));

        frame.add(layeredPane);

        frame.setVisible(true);
    }
}
