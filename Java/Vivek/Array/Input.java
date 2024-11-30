package Array;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your 2D matrix");
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        System.out.println("Enter the input");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        
        sc.close();
    }
}
