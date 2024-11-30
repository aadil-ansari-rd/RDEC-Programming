import java.util.Scanner;

public class SwitchCal {
    public static void main(String[] args) {
        Scanner wc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = wc.nextInt();
        int b = wc.nextInt();
        System.out.println("For addition press 1 \n For subtraction press 2 \n For multiplication press 3 \n For division press 4 ");
        int n = wc.nextInt();
        switch(n ){
            case 1 :
            int s = a + b ;
            System.out.println("Sum is : " +s);
            break;

            case 2 :
            int di = a - b ;
            System.out.println("Difference is : " +di);
            break;

            case 4 :
            int d = a / b ;
            System.out.println("Division is : " +d);
            break;

            case 3 :
            int mu = a * b ;
            System.out.println("Multiplication is : " +mu);
            break;

            default :
            System.out.println("Wrong input");
        }
        wc.close();

    }
}
