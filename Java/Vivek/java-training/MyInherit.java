class Parent{
    String name = "Ram " ; 
    public static void display(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    String name = "Shyam " ; 
    public static void display(){
        System.out.println("Child");
    }
    
}
public class MyInherit {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
        System.out.println(p.name);
    }
}