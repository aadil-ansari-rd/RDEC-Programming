class ABC 
{
    public void display(){
        System.out.println("Parent");
    }
    public void show (){}
}
class PQR extends ABC
{
    public void show(){
        display();
        System.out.println("Child");
    }
}

public class Inherit1 {
    public static void main(String[] args) {
        // ABC p = new PQR();
        // p.display();
        // p.show();
        PQR t = new PQR();
        t.show();

    }
    
}
