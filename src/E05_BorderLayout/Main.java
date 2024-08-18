package E05_BorderLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // BorderLayout = places components in five areas: NORTH, SOUTH, WEST, EAST, and/or CENTER.

        JFrame frame = new JFrame();

        JPanel greenPanel = new JPanel();
        JPanel yellowPanel = new JPanel();
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel pinkPanel = new JPanel();

        greenPanel.setBackground(Color.green);
        yellowPanel.setBackground(Color.yellow);
        redPanel.setBackground(Color.red);
        bluePanel.setBackground(Color.blue);
        pinkPanel.setBackground(Color.pink);

        // setSize() doesn't work somehow.
        // https://www.bing.com/search?pglt=675&q=setSize()+vs+setPreferredSize()&cvid=a3879ccd16a74b949bff299340edb0a1&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCTExNzg0ajBqMagCALACAA&FORM=ANNTA1&PC=U531
        greenPanel.setPreferredSize(new Dimension(100, 100));
        yellowPanel.setPreferredSize(new Dimension(100, 100));
        redPanel.setPreferredSize(new Dimension(100, 100));
        bluePanel.setPreferredSize(new Dimension(100, 100));
        pinkPanel.setPreferredSize(new Dimension(100, 100));

        // =========== Sub-panels ===========

        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel orangePanel = new JPanel();
        JPanel grayPanel = new JPanel();
        JPanel blackPanel = new JPanel();

        cyanPanel.setBackground(Color.cyan);
        magentaPanel.setBackground(Color.magenta);
        orangePanel.setBackground(Color.orange);
        grayPanel.setBackground(Color.gray);
        blackPanel.setBackground(Color.black);

        cyanPanel.setPreferredSize(new Dimension(50, 50));
        magentaPanel.setPreferredSize(new Dimension(50, 50));
        orangePanel.setPreferredSize(new Dimension(50, 50));
        grayPanel.setPreferredSize(new Dimension(50, 50));
        blackPanel.setPreferredSize(new Dimension(50, 50));

        pinkPanel.setLayout(new BorderLayout());

        pinkPanel.add(cyanPanel, BorderLayout.NORTH);
        pinkPanel.add(magentaPanel, BorderLayout.WEST);
        pinkPanel.add(orangePanel, BorderLayout.SOUTH);
        pinkPanel.add(grayPanel, BorderLayout.EAST);
        pinkPanel.add(blackPanel, BorderLayout.CENTER);

        // ==================================

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // Passing a LayoutManager with margins
        frame.setLayout(new BorderLayout(10, 10));

        frame.add(greenPanel, BorderLayout.NORTH);
        frame.add(yellowPanel, BorderLayout.WEST);
        frame.add(redPanel, BorderLayout.SOUTH);
        frame.add(bluePanel, BorderLayout.EAST);
        frame.add(pinkPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
