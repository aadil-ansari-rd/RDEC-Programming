class Student{
    String name;
    int rollno ;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
}
public class MyStudent {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();
        S1.display();
        S2.display();
    }

}

