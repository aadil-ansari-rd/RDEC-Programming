package HW1;

import java.util.Scanner;

public class SearchInArray {
    static void search(int arr[], int num) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                System.out.println("Your Element is at index : " + i);
            }
            if(i==arr.length){
                System.out.println("Element Not Found");
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 4, 5, 46, 4, 123, 45 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Which value you want to search ? ");
        int s = sc.nextInt();
        search(arr, s);
        sc.close();
    }
}
