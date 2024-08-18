package E01_Frames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    // JFrame = a GUI window to add components to.

    MyFrame() {
        Dimension dimension = new Dimension(420, 420);
        this.setSize(dimension);
        this.setTitle("ጄፍሬም");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // The default is JFrame.HIDE_ON_CLOSE.
//        frame.setResizable(false);
        this.setVisible(true);
        ImageIcon icon = new ImageIcon("E01_Frames/icon.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(123, 50, 250));
    }
}
