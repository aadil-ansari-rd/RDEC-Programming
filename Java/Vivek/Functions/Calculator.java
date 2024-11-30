import java.util.Scanner;

public class Calculator {

    static int add (int x , int y) {
        return x+y ;
    }
    static int sub(int x , int y){
        return x-y ;
    }
    static int mul(int x , int y){
        return x*y ;        
    }
    static int div(int x , int y){
        return x/y ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;
        System.out.println("Which operation you want to perform : Addition , Substraction , Multiplication , Division ");
        char op = sc.next().charAt(0);
        if (op=='a'|| op == 'A')
            System.out.println(add(a,b)); 
        else if (op=='s'|| op == 'S')
            System.out.println(sub(a,b)); 
        else if (op=='m'|| op == 'M')
            System.out.println(mul(a,b));
        else if (op=='d'|| op == 'D')
            System.out.println(div(a,b));  
        sc.close();
    }
}
