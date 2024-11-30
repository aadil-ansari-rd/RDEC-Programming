import java.util.Scanner;

public class SumIn10 {
    static void sum(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            sum = sum + ((i*10)+2);
        }
        System.out.println("Sum is " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        sum(n);
        sc.close();
    }
    
}
