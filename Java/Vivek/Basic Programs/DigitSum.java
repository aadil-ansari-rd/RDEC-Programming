import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int r,s =0;
        while(num!=0){
           r = num%10;
           num=num/10;
           s = s+r; 
        }
        System.out.println("Sum is "+ s);
        sc.close();
    }
}
