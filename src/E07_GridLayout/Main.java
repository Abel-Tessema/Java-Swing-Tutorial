package E07_GridLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // GridLayout = places components in a grid of cells. Each component takes all the available space within its
        //              cell, and each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 3, 10, 10));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
//        frame.add(new JButton("10"));
        /*
        * If we specify the number of rows and columns in the GridLayout constructor, and there are more components than
        * (rows * columns), then the GridLayout adds a column or columns in order to fit them all. You can test this by
        * adding in the tenth button above.
        */

        frame.setVisible(true);

    }
}
