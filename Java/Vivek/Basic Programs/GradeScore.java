import java.util.Scanner;

public class GradeScore{
    public static void main(String[] args) {
        Scanner kc = new Scanner(System.in);
        System.out.println("Enter your score");
        int sc = kc.nextInt();
        if(sc<=100 && sc>=90){
            System.out.println("Your grade score is : A ");
        }
        else if(sc>=80 && sc< 90){
            System.out.println("Your grade score is : B ");
        }
        else if(sc>=70 && sc< 80){
            System.out.println("Your grade score is : C ");
        }
        else if(sc>=60 && sc< 70){
            System.out.println("Your grade score is : D ");
        }
        else if(sc>=0 && sc< 60){
            System.out.println("Your grade score is : E ");
        }
        else{
            System.out.println("Wrong input");
        }
        kc.close();

    }
}