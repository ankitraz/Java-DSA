package JavaAWT;
import javax.swing.*;
public class Simple {
    public static void main(String[] args) {
        new swing();
    }
}

class swing{
    JFrame frame;

    public swing() {
        frame = new JFrame();
        JButton button = new JButton("Click");

        button.setBounds(130,100,100,40);
        frame.setSize(400,500);
        frame.setVisible(true);
        frame.add(button);
    }
}
