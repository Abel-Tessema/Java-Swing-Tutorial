package E04_Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame /* implements ActionListener */ {
    // JButton = a button that performs an action when clicked on.

    JButton button;
    JLabel label;
    MyFrame() {
        Image image1 = new ImageIcon("icon.png").getImage();
        Image image2 = new ImageIcon("icon.png").getImage();
        Image scaledImage1 = image1.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image scaledImage2 = image2.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon icon1 = new ImageIcon(scaledImage1);
        ImageIcon icon2 = new ImageIcon(scaledImage2);

        label = new JLabel(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();

        button.setBounds(100, 100, 250, 100);
        button.setText("Butt-on");
        button.setFocusable(false);
        button.setIcon(icon1);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setFont(new Font("Poppins", Font.BOLD, 25));
        button.setIconTextGap(-5);
        button.setForeground(Color.magenta);
        button.setBackground(Color.blue);
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);

//        button.addActionListener(this);
        button.addActionListener(
            event -> {
//                if (event.getSource() == button) // This is necessary only inside the actionPerformed() method of the
//                                                    ActionListener interface, i.e., when we make the current class
//                                                    implement it, and define its method, rather than pass it a lambda
//                                                    expression.
                    System.out.println("Girma Girma na eyyyy!");
//                button.setEnabled(false);
                label.setVisible(!label.isVisible());
            }
        );

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);

        this.add(button);
        this.add(label);

        this.setVisible(true);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == button)
//            System.out.println("Girma Girma na eyyyy!");
//    }
}
