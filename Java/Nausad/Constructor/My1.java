class A 
{
    String name ;
    int age , sal;
    A(){
        this("Ram", 12);
    }
    A(String name , int age){
        this(name, age, 1000);
    }
    A(String name , int age, int sal){
        this.name= name;
        this.age= age;
        this.sal = sal;
    }
    void display(){
        System.out.println(name + " " + age + " "+ sal);
    }
}
public class My1 {
    

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A("Mohan", 15);
        A a3 = new A("Sohan", 20, 50000);
        a1.display();
        a2.display();
        a3.display();
    }
}
