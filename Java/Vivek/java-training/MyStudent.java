class Student{
    String name;
    int rollno ;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
     Student(String name , int rollno){
        this.name = name ;
        this.rollno = rollno ;
    }
}
public class MyStudent {
    public static void main(String[] args) {
        //Student S1 = new Student(); 
        //Student S2 = new Student();
        Student S1 = new Student("Ram",101);
        Student S2 = new Student("Shyam",102); 
        S1.display();
        S2.display();
    }

}

