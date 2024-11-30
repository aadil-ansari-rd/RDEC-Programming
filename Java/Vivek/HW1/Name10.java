package HW1;

import java.util.Scanner;

public class Name10 {
    static void printname(String name , int times){
        if(times==0){
            return ;
        }
        System.out.println(name);
        printname(name, times-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("How many times you want to print your name");
        int times = sc.nextInt();
        printname(name, times);
        sc.close();

    }
}
