package Testt;

import java.util.Scanner;

public class SeriesSum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of terms : ");
        int num = sc.nextInt();
        double sum = 0;
        for(int i = 1;i<=num; i++){
            if(i%2!=0){
                sum=sum-(i/(i+1));
            }
            else{
              sum=sum+(i/(i+1));  
            }
        }
        System.out.println("Sum is : " + sum);
        sc.close();

    }
}
