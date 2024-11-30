import java.util.Scanner;

public class Percentage {
    static void percentage(int x){
        if(x>=90){
            System.out.println("A Grade");
        }
        else if((x>70)&&(x<89)){
            System.out.println("B Grade");
        }
        else if((x>50)&&(x<69)){
            System.out.println("C Grade");
        }
        else if(x<50){
            System.out.println("D Grade");
        }
        else {
            System.out.println("No Grade");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage");
        int per = sc.nextInt();
        percentage(per);
        sc.close();
    }
}
