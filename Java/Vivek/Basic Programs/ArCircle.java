import java.util.Scanner;
public class ArCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        int r = sc.nextInt() ;
        int ar = (22/7) * r * r;
        int cir = 2* 22/7 * r;
        System.out.println(" Area of circle : " + ar);
        System.out.println(" Circumference : " + cir);
        sc.close();
   }
    
}
