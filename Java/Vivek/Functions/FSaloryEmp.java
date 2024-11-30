import java.util.Scanner;

public class FSaloryEmp {

    static double HRA(double x) {
        double hra = 0.3 * x;
        return hra;
    }

    static double TA(double x) {
        double ta = 0.1 * x;
        return ta;
    }

    static double DA(double x) {
        double da = 0.2 * x;
        return da;
    }

    static double PF(double x) {
        return 1400;
    }

    static double NetSalory(double x) {
        double hra = HRA(x);
        double ta = TA(x);
        double da = DA(x);
        double pf = PF(x);
        double net = x + hra + ta + da - pf;
        return net;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your basic salory : ");
        double basicSalary = sc.nextDouble();
        double net = NetSalory(basicSalary);
        System.out.println("Your Net Salory Is " + net);
        sc.close();
    }
}
