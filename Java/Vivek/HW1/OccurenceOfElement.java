package HW1;

import java.util.Scanner;

public class OccurenceOfElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 4, 5, 46, 4, 123, 45 , 5 ,5 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to count the occurence of ");
        int value = sc.nextInt();
        int occurence = 0;
        for(int i=0;i<arr.length;i++ ){
            if(arr[i]==value){
                occurence++;
            }
        }
        System.out.println("Number of occurence of the given value is : "+ occurence);
        sc.close();
    }
}
