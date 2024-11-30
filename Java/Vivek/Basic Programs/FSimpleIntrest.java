import java.util.Scanner;

public class FSimpleIntrest {
    void met1(int x, int y, int z) {
        int si = (x * y * z) / 100;
        System.out.println("Simple Intrest Is = " + si);
    }

    int met2(int i, int j, int k) {
        int si = (k * i * j) / 100;
        return (si);
    }

    public static void main(String[] args) {
        FSimpleIntrest obj = new FSimpleIntrest();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of P , R , T ");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int sim = obj.met2(p, r, t);
        System.out.println("Simple Intrest Is = " + sim);

        obj.met1(p, r, t);
        sc.close();

    }

}
