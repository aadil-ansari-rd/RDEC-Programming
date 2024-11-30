class Parent{
    String name;
    int age;
    Parent(String name,int age){
        this.name = name;
        this.age = age;

    }
}
class Child extends Parent{
    int salary;
    Child(String name , int age , int sal){
        super(name, age);
        salary = sal;
    }
    public void display(){
        System.out.println(name + " " + age + " "+ salary);
    }
    
}
public class MyInheritt {
    public static void main(String[] args) {
        Child k = new Child("Ram" , 10 ,10000);
        k.display();
    }
}