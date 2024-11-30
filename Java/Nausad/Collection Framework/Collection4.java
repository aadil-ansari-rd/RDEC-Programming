import java.util.*;
class Myutil4{
    public void show(){
        ArrayList v = new ArrayList();
        for(int i=0;i<10;i++){
            v.add(i);
        }
        System.out.println(v);
        Iterator e = v.iterator();
        while (e.hasNext()){
            System.out.println("------------");
            Integer I = (Integer)e.next();
            if(I%2==0){
                System.out.println(I);
            }
            else{
                e.remove();
            }
            //System.out.println(e.next());
        } 
        System.out.println("New Array List");
        System.out.println(v);    
        
    }
}
public class Collection4 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Myutil4 p = new Myutil4();
        p.show();
    }
}
