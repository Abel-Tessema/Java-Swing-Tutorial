package E09_OpenANewGUIWindow;

import javax.swing.*;

public class LaunchPage {
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");

    LaunchPage() {
        button.setBounds(100, 100, 150, 50);
        button.setFocusable(false);
        button.addActionListener(
            event -> {
                frame.dispose();
                NewWindow newWindow = new NewWindow();
            }
        );

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        frame.add(button);

        frame.setVisible(true);
    }
}
