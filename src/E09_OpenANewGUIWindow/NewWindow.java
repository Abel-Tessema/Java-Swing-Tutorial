package E09_OpenANewGUIWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Yahallo!");

    NewWindow() {
        label.setBounds(50, 50, 300, 50);
        label.setFont(new Font(null, Font.PLAIN, 40));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        frame.add(label);

        frame.setVisible(true);
    }
}
