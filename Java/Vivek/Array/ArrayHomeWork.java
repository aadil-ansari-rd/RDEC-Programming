package Array;

import java.util.Scanner;

public class ArrayHomeWork {
    static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    static int evensum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    static int oddsum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    static void search(int arr[], int num) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                System.out.println("Your Element is at : " + i);
            }
            if(i==arr.length){
                System.out.println("Element Not Found");
            }
        }

    }
    static int large(int arr[]){
        int lar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar ;
    }
    static int smallest(int arr[]){
        int sm = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<sm){
                sm=arr[i];
            }
        }
        return sm ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which value you want to search ? ");
        int s = sc.nextInt();
        int arr[] = { 1, 2, 5, 6, 4, 5, 46, 4, 123, 45 };
        System.out.println("Total Sum : " + sum(arr));
        System.out.println("Event Element Sum : " + evensum(arr));
        System.out.println("Odd Element Sum : " + oddsum(arr));
        search(arr, s);
        System.out.println("Largest Number Is : " + large(arr));
        System.out.println("Smallest Number Is : " + smallest(arr));
        sc.close();
    }
}
