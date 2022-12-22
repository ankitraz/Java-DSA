package JavaAWT.EventHandeling;

import java.awt.*;
import java.awt.event.*;


public class eventHandeling {
    public static void main(String[] args) {
        new awtEvent();
    }
}

class awtEvent implements ActionListener{
        TextField textField;
    public awtEvent() {
        Frame frame = new Frame();
        textField = new TextField();
        Button button = new Button("Click me");

        textField.setBounds(60,50,170,20);
        button.setBounds(100,120,80,30);

        button.addActionListener(this);

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button);
        frame.add(textField);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("Welcome to java action listner");
    }
}