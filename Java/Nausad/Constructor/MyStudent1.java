class Student{
    String name;
    int rollno ;
    Student(String name , int rollno){
        name = name ;
        rollno = rollno ;
    }
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
}public class MyStudent1 {
    public static void main(String[] args) {
        Student S1 = new Student("Ram",101);
        Student S2 = new Student("Shyam",102);
        S1.display();
        S2.display();
    }
}
