import javax.swing.*;

class Calculator extends JFrame {   //Inherit


    private JButton existButton;   //Attribute,Reference Variable

    Calculator(){
        setSize(400,400);
        setTitle("Calculator");
        existButton=new JButton("Exist Button");
        add(existButton);

    }
}



















public class Inheritance1 {
    public static void main(String[] args) {

        Calculator c=new Calculator();
        c.setVisible(true);
    }
}




