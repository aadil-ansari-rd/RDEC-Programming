package HW1;

import java.util.Scanner;

public class ReplaceElementArr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 4, 5, 46, 4, 123, 45 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int value = sc.nextInt();
        System.out.println("Enter Index");
        int index = sc.nextInt();
        arr[index]= value;
        for(int i :arr){
            System.out.print(i +  " ");
        }
        sc.close();
    }
}
