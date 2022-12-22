package javaEndTerm.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class eventexmp extends Frame implements ActionListener{
        TextField tf;
    eventexmp(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("click here");
        b.setBounds(100,120,80,30);

        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int i = 0;
        tf.setText(String.valueOf(i+1));
    }
}

public class eventhandeling {
    public static void main(String[] args) {
        eventexmp e = new eventexmp();
    }
}
