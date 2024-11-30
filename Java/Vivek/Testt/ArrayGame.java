package Testt;

import java.util.Scanner;

public class ArrayGame {

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
        System.out.println("here is your array matrix");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int ch, x, y, m, n;
        do {
            System.out.println("Enter your choice : ");
            System.out.println("Press 1 For Adding a value at a particular palace.");
            System.out.println("Press 2 For Deleting a value at a particular place.");
            System.out.println("Press 3 For Gettting sum of the array.");
            System.out.println("Press 4 For Swap two values of particular place.");
            System.out.println("Press 5 For Checking prime numbers in the array.");
            System.out.println("Press 6 For exit the programme.");
            ch = sc.nextInt();
            switch (ch) {

                case 1:
                    System.out.println("Enter the value ");
                    int v = sc.nextInt();
                    System.out.println("Enter the ith and jth index of the place ");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    arr[x][y] = v;
                    System.out.println("here is your array matrix");
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            System.out.print(arr[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter the ith and jth index of the value that you want to delete");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    arr[x][y] = 0;
                    for (int i = x; i < size; i++) {
                        int j;
                        for (j = y; j < size - 1; j++) {
                            arr[i][j] = arr[i][j] + arr[i][j + 1];
                            arr[i][j + 1] = arr[i][j] - arr[i][j + 1];
                            arr[i][j] = arr[i][j] - arr[i][j + 1];
                        }
                        if ((i + 1) < size) {
                            arr[i][j] = arr[i][j] + arr[i + 1][0];
                            arr[i + 1][0] = arr[i][j] - arr[i + 1][0];
                            arr[i][j] = arr[i][j] - arr[i + 1][0];
                        }

                    }
                    System.out.println("here is your array matrix");
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            System.out.print(arr[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

            }

        } while (ch < 6 || ch > 0);

        sc.close();
    }
}
