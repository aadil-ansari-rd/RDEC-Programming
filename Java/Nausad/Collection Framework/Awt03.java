import java.awt.*;
import java.awt.event.*;

public class Awt03 extends Frame implements MouseListener{
    Awt03(){
        addMouseListener(this);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }
    public void mouseClicked(MouseEvent e){
        Graphics g = getGraphics();
        g.getColor();

    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public static void main(String[] args) {
        new Awt03();
    }
}
