package JavaAWT;

import java.awt.*;

public class javaAwt {
    public static void main(String[] args) {
//        awt one = new awt();
//        awtUsingAssociation one = new awtUsingAssociation();
        awtnew one = new awtnew();
    }

}

class awt extends Frame{
    public awt() throws HeadlessException {
        Button button = new Button("click here");
        button.setBounds(30,100,80,30);
        setSize(300,300);
        setTitle("Awt Example");
        setLayout(null);
        setVisible(true);
        add(button);
    }
}


class awtUsingAssociation{
    public awtUsingAssociation() {
        Frame frame = new Frame("hello world.");
        Button button = new Button("click here.");
        button.setBounds(30,100,80,30);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(button);
    }
}

class awtnew{
    public awtnew() {
        Frame frame = new Frame("Employee info");
        Button button = new Button("submit");
        Label label = new Label("Employee id");
        TextField textField = new TextField();

        button.setBounds(100,100,80,30);
        textField.setBounds(20,100,80,30);
        label.setBounds(20,80,80,30);


        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);


        frame.add(button);
        frame.add(label);
        frame.add(textField);
    }
}
