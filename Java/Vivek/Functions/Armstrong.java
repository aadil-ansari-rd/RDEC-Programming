import java.util.Scanner;

public class Armstrong {

    static int lenghth(int x) {
        int len = 0;
        while (x != 0) {
            x = x / 10;
            len++;
        }
        return len;
    }

    static int power(int x , int y) {
        int i, pow = 1;
        for (i = 1; i <= y; i++) {
            pow = pow * x;
        }
        return pow;
    }

    static int armstrong(int x){
        int r , s, arm=0 ;
        int y = lenghth(x);
        while(x!=0){
            r = x%10;
            x=x/10;
            s=power(r , y);
            arm =arm + s;
        }
        return arm ;
    }

    static void check(int x) {
        int y = armstrong(x);
        if (x == y) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        check(num);
        sc.close();

    }
}
