import java.util.Scanner;

public class UnitConersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit");
        String u = sc.nextLine();
        System.out.println("Enter the Magnitude ");
        float m = sc.nextFloat();
        
        float r ;
        switch(u){
            case "m":
            r = m*100;
            System.out.println(r +"cm");
            break;
            case "cm":
            r = m*100;
            System.out.println(r +"cm");
            break;
            case "c":
            r = (9*m/5)+ 32;
            System.out.println(r +"f");
            break;
            case "f":
            r = (m - 32)*5/9;
            System.out.println(r +"c");
            break;
            case "kg":
            r = m*1000;
            System.out.println(r +"gm");
            break;
            case "gm":
            r = m/1000;
            System.out.println(r +"km");
            break;
            default:
            System.out.println("Wrong Input");
            break;

        }
        sc.close();
    }
}
