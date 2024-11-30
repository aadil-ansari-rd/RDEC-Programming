import java.util.Scanner;

public class CalculaterIf {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println("Enter two digit");
        int a = nc.nextInt();
        int b = nc.nextInt();
        int add , sub , mul , div ;
        System.out.println("Which operation you want to perform : Addition , Substraction , Multiplication , Division");
        char op = nc.next().charAt(0);
        if (op=='a'|| op == 'A'){
            add = a + b ;
            System.out.println(add); 
        }
        else if (op=='s'|| op == 'S'){
            sub = a - b ;
            System.out.println(sub);  
        }
        else if (op=='m'|| op == 'M'){
            mul = a * b ;
            System.out.println(mul);
        }
        else if (op=='d'|| op == 'D'){
            div = a / b ;
            System.out.println(div);   
        }
        else
        {
            System.out.println("Wrong input");
        }
        nc.close();
    }
}
