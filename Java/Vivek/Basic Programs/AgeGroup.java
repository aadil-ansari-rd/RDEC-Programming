package Functions;
import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner oc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int n = oc.nextInt();
        if ( n>=0 && n <12){
            System.out.println("Child Age");

        }
        else if ( n>=13 && n<=19){
        System.out.println("Teenager age group");
        }
        else if( n>=20 && n<= 45){
            System.out.println("Ädult age group");
        }
        else if( n>= 46 && n<=90){
            System.out.println("Senior citizen age group");

        }
        else {
            System.out.println("You age not alive");
        }
        oc.close();
    }
    
}
