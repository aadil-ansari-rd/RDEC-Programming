import java.util.Scanner;

public class Armstrong2 {
    static void sum(int x){
        int i, num = x, p = 0, r, sum = 0, power;

        while (num != 0) {
            num /= 10;
            p++;
        }
        num = x;
        while (num != 0) {
            power = 1;
            r = num % 10;
            for (i = 1; i <= p; i++) {
                power = power * r;
            }
            sum = sum + power;
            num = num / 10;
        }
        if (sum == x)

        {
            System.out.println("This is an Armstrong Number");
        } else {
            System.out.println("This is not an Armstrong Number");
        }
    }
    public static void main(String[] args) {
        Scanner yc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = yc.nextInt();
        sum(n);
        yc.close();
    }
}
