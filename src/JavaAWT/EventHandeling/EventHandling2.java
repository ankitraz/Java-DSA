package JavaAWT.EventHandeling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling2 {
    public static void main(String[] args) {
        new awt();
    }
}

class awt implements ActionListener{
    TextField tf1;
    TextField tf2;
    Label label;

    public awt() {
        Frame frame = new Frame("Action listener example");
        tf1 = new TextField();
        tf2 = new TextField();
        label = new Label("");
        Button button = new Button("Sum");

        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLayout(null);

        tf1.setBounds(50,50,150,20);
        tf2.setBounds(220,50,150,20);
        label.setBounds(100,120,150,200);
        button.setBounds(50,100,60,30);

        frame.add(tf1);
        frame.add(tf2);
        frame.add(label);
        frame.add(button);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        int c = a +b;
        label.setText("Sum is: " + String.valueOf(c) );
    }
}
