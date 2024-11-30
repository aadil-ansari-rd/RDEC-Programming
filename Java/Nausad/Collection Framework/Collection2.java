import java.util.*;
//Vector Class......
class Student2{
    String name;
    int age ;
    int marks;
    public Student2(String name , int age , int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public String toString(){ // it will be called by default when we print the object of a class
        return name + " "+ age + " "+ marks;
    }
}

class Employee2{
    String name ;
    String fathername;
    String mobile;
    public Employee2(String name , String fathername, String mobile){
        this.name = name;
        this.fathername = fathername;
        this.mobile = mobile;
    }
    public String toString(){ // it will be called by default when we print the object of a class
        return name + " "+ fathername + " "+ mobile;
    }
}
class MyCol2{
    public void show(){
        Vector v = new Vector();
        System.out.println("Size  "+ v.size());
        System.out.println("Capacity  "+v.capacity());
        for(int i=0;i<12;i++){
            v.add(i);
        }
        System.out.println("After insertion");
        System.out.println("Size  "+ v.size());
        System.out.println("Capacity  "+v.capacity());
    }
    
}

public class Collection2 {
    public static void main(String[] args) {
        MyCol2 m = new MyCol2();
        m.show();
    }
}
