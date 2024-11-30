import java.util.Scanner;

public class Swap2Var {
    public static void main(String[] args) {
        Scanner ac = new Scanner (System.in);
        System.out.println(" enter the variables");
        int a = ac.nextInt();
        int b = ac.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println( " first number is : " + a);
        System.out.println( " Second number is : " + b);
        ac.close();

     }

}
