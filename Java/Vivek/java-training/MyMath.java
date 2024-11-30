class Circle
{
    public void area()
    {
        int a =4 ;
        double k = 3.14*a*a;
        System.out.println(k);
    }
    
}
class Sphere extends Circle{
    public void volume()
    {
        int a = 4 ;
    double v = 3.14*(4/3)*a*a*a;
    System.out.println(v);
    }
}
public class MyMath {
    public static void main(String[] args) {
        Sphere k = new Sphere();
        k.area();
        k.volume();
    }
}
