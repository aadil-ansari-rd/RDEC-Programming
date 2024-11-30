import java.awt.*;
import java.awt.event.* ;
public class Awt02 extends Frame implements ActionListener {
    TextField tf ;
    Awt02(){
        tf = new TextField();
        tf.setBounds(60,50,180,25);
        Button button = new Button("Click here");
        button.setBounds(100, 120, 80, 70);
        button.addActionListener(this);
        add(tf);
        add(button);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("hello dear");

    }
    public static void main(String[] args) {
        new Awt02();
    }
}
