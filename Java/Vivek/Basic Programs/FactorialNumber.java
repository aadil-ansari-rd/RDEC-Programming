import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        System.out.println("Enter a number you want factorial of : ");
        int n = rc.nextInt();
        int i , fact=1 , c; 
        for(i=1; i<=n ; i++){
            fact = fact*i;
        }
        System.out.println("Factorial is : " +fact);
        rc.close();
    }
}
