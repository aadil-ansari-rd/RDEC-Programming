import java.util.*;
class Employee4{
    String name , age, add, phone;
    public Employee4(String name , String age, String add, String phone){
        this.name = name;
        this.age = age;
        this.add= add;
        this.phone = phone;
    }
    public String toString(){ 
        return name + " "+ age + " "+ add + " "+ phone;
    }
}

public class Collection6 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Employee4 e1 = new Employee4("Ram", "20", "Delhi", "12345678");
        Employee4 e2 = new Employee4("Shyam", "20", "Goa", "987654321");
        Employee4 e3 = new Employee4("Luv", "20", "Noida", "12345678");
        Employee4 e4 = new Employee4("Reet", "20", "Delhi", "12345678");
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        System.out.println(al);
    }
}
