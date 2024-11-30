package Array;

public class MyFile1 {
    public static void main(String[] args) {
        Emp a = new Emp();
        a.display();
        Student b = new Student();
        b.show();
    }
}
class Emp
{
    public void display(){
        System.out.println("Hello");
    }
}
class Student{
    public void show(){
        System.out.println("like");
    }
}
