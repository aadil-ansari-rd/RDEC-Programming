import java.util.Scanner;

public class NetSalory {
    public static void main(String[] args) {
        Scanner vc = new Scanner(System.in);
        System.out.println("Enter your basic salory : ");
        int s = vc.nextInt();
        int hra = (s*30) / 100 ;
        int da = (s*20)/100;
        int ta = (s*10)/100;
        int pf = 1400 ;
        int net = s + hra + da + ta - pf ;
        System.out.println("Net Salory : "+net);
        vc.close();

        }
}
