import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner ec = new Scanner(System.in);
        System.out.println(" Enter Principal amount , Rate of interest and Time");
        int p = ec.nextInt();
        int r = ec.nextInt();
        int t = ec.nextInt();

        float si = (p*r*t) / 100 ;
        System.out.println(" Simple Interest is : " +si);
        ec.close();
    }
}
