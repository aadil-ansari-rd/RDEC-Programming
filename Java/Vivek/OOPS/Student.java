package OOPS;

public class Student {
    String name;
    int rollNO;
    String branch;
    int batchyear;

    public Student(String name,int rollNO,String branch,int batchyear){
        this.name = name;
        this.rollNO = rollNO;
        this.batchyear = batchyear;
        this.branch= branch;
    }
    public void printStudentDetails(){
        System.out.println(name);
        System.out.println(rollNO);
        System.out.println(branch);
        System.out.println(batchyear);
    }
}
