import java.util.Scanner;

public class Tringle {
    static void Eq(int x , int y , int z){
        if((x==y)&&(y==z)){
            System.out.println("Eqilateral");
        }
        else if((x==y)&&(y!=z)){
            System.out.println("Isoscale");

        }
        else if ((x!=y)&&(y!=z)){
            System.out.println("Scalene");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all three sides of triangle ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Eq(a, b, c);
        sc.close();


    }
}
