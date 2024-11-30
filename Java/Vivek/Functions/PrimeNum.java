import java.util.Scanner;

public class PrimeNum {
    static void check(int x) {
        int r=1, num = x;
        for (int i = 2; i <= x / 2; i++) {
            r = num % i;
            if(r==0){
                i=x;
            }
        }
        if (r==0) {
            System.out.println("Not a prime number");
            
        }
        else{
            System.out.println("Prime Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = sc.nextInt();
        check(num);
        sc.close();

    }
}
