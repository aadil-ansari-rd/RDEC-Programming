import java.util.*;
class Myutil1{
    public void show(){
        Vector v = new Vector();
        for(int i=0;i<10;i++){
            v.add(i);
        }
        System.out.println(v);
        Enumeration e= v.elements();
        while(e.hasMoreElements()){
            System.out.println("----------------------------- c ");
            System.out.println(e.nextElement());
        }
    }
}
public class Collection3 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Myutil1 p = new Myutil1();
        p.show();
    }
}
