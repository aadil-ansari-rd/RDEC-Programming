import java.util.Scanner;

public class SwapWTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter the variables");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println( " first number is : " + a);
        System.out.println( " Second number is : " + b);
        sc.close();

     }

}
