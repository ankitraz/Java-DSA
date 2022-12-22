package javaEndTerm.AWT;

import java.awt.*;

class myframe extends Frame{
    myframe(){
        Button b = new Button("click me");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("exmmmmm");
        setLayout(null);
        setVisible(true);
    }
}


public class awtExample1 {
    public static void main(String[] args) {
        myframe frame = new myframe();
    }
}
