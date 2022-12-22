package AWTlayout;

import javax.swing.*;
import java.awt.*;

public class Border {

    JFrame frame;
    Border(){
        frame = new JFrame();
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("south");
        JButton b3 = new JButton("east");
        JButton b4 = new JButton("west");
        JButton b5 = new JButton("center");

        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.EAST);
        frame.add(b4, BorderLayout.WEST);
        frame.add(b5, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.setSize(300,300);
    }



    public static void main(String[] args) {
        new Border();
    }
}
