import java.awt.*;

public class Awt01 extends Frame{
    Awt01(){
        Button b = new Button("Click Me");
        b.setBounds(30, 100,80,30);
        //setting button postiotion screen
        add(b);
        setSize(300,300);
        //Frame size 300 width and 300 height
        setTitle("This is awt example");
        //Setting the title of frame
        setLayout(null);
        //No layout manager
        setVisible(true);
        //Now frame will be visible bcz it is not visible by default

    }
    public static void main(String[] args) {
        Awt01 f = new Awt01();
    }
}
