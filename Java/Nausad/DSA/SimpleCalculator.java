import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch ;
        do
        {
            System.out.println("Enter two numbers a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Which Operation you want to perform : '+' , '-' , '*' , '/'");
            char c = sc.next().charAt(0);
            switch (c) {
                
                    case '+':
                    System.out.println("Sum : "+ (a+b));
                    break;

                    case '-':
                    System.out.println("Difference : "+ (a-b));
                    break;

                    case '*':
                    System.out.println("Product : "+ a*b);
                    break;

                    case '/':
                    if(b!=0){
                        System.out.println("Division : "+ a/b);
                    }
                    else
                    {
                        System.out.println("b can not be 0 ");
                    }
                    break;

                    
            
                default:
                    System.out.println("Wrong Choice : ");
                    break;
            }
            System.out.println("Press 1 to use calculator ");
            System.out.println("Press 0 for exit ");
            ch= sc.nextInt();
        }while(ch!=0);
        sc.close();

    }
}
