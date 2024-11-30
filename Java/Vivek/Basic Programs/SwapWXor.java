import java.util.Scanner;

public class SwapWXor {
    public static void main(String[] args) {
        Scanner fc = new Scanner(System.in);
        System.out.println(" enter the variables");
        int a = fc.nextInt();
        int b = fc.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println( " first number is : " + a);
        System.out.println( " Second number is : " + b);
        fc.close();
    }
    
}
