import java.util.*;
//Collection framework always found in util package
// ArrayList Class......
class Student{
    String name;
    int age ;
    int marks;
    public Student(String name , int age , int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public String toString(){ // it will be called by default when we print the object of a class
        return name + " "+ age + " "+ marks;
    }
}

class Employee{
    String name ;
    String fathername;
    String mobile;
    public Employee(String name , String fathername, String mobile){
        this.name = name;
        this.fathername = fathername;
        this.mobile = mobile;
    }
    public String toString(){ // it will be called by default when we print the object of a class
        return name + " "+ fathername + " "+ mobile;
    }
}

class MyCol1{
    public void show(){
        ArrayList k  = new ArrayList(3);
        System.out.println(k.size());//give the current size of list
        k.add(10);
        k.add(11.5);
        k.add("Ram");
        k.add("Mohan");
        k.add(null);
        Student s = new Student("Ram", 18, 95);
        k.add(s); // hash code of object will be add ( i.e. hash code of s )if toString is not defined in the class
        Employee em = new Employee("Shyam", "Ram", "123456788");
        k.add(em);
        System.out.println(k);
    }
}
public class Collection1 {
    public static void main(String[] args) {
        MyCol1 p = new MyCol1();
        p.show();
        
    }
}
