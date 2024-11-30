import java.util.Scanner;

public class ReverseTwoDigit {
    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);
        System.out.println("Enter a two digit number");
        int n = mc.nextInt();
        int a , rev ;
        a = n%10;
        n = n/10;
        rev = a*10 + n ;
        System.out.println("Reverse digit number is  " + rev );
        mc.close();

    }
}
