import java.util.Scanner;

public class DigitName {
    static String name(int a){
        switch(a){
            case 0 :
            return "Zero";
            case 1 :
            return "One";
            case 2 :
            return "Two";
            case 3 :
            return "Three";
            case 4 :
            return "Four";
            case 5 :
            return "Five";
            case 6 :
            return "Six";
            case 7 :
            return "Seven";
            case 8 :
            return "Eight";
            case 9 :
            return "Nine";
        }
        return "Not Valid";
    }
    static int reverseNum(int number){
        int num=0, r;
        while(number!=0){
            r= number%10;
            number= number/10;
            num = num*10+r;
        }
        return num;
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int num= reverseNum(number);
        
        int digit;
        while (num!=0) {
            digit = num%10;
            num= num/10;
            System.out.print(name(digit)+ " ");            
        }
        sc.close();

    }
}
