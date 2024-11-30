package Recursion;
import java.util.Scanner;

public class Name {
    static void name(String x , int y){
        if(y==0){
            return;
        }
        // System.out.println(x);
        name(x, y-1);
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name");
        String nam = sc.nextLine();
        System.out.println("how many times the name should be printed");
        int n = sc.nextInt();
        name(nam, n);
        sc.close();

    }
}
