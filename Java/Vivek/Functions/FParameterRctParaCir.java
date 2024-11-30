import java.util.Scanner;

public class FParameterRctParaCir {
    static double cir(double a){
        double ci = 2 * 3.14 * a  ;
        return(ci) ;
    }
    static double arC(double a){
        double aC = 3.14 * a* a ;
        return aC ;
    }
    static int para(int x , int y){
        return(2*(x+y)) ;
    }
    static int arR(int x , int y){
        return x*y ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breath of rectangle");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the radis of circle ");
        float r = sc.nextFloat();

        int p = para(l,b);
        int re = arR(l,b);
        double c = cir(r);
        double ci = arC(r);

        System.out.println("Parameter of rectangle is "+ p);
        System.out.println("Parameter of rectangle is "+ re);
        System.out.println("Circumference is "+ c);
        System.out.println("Circumference is "+ ci);
        sc.close();

    }
}
