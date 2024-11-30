package HW1;

import java.util.Scanner;

public class ArrayIsSorted {
    static void isSorted(int[][] arr , int size){
        int a=0 , j;
        for(int i=0; i<size;i++){
            for( j=0; j<size-1 ;j++){
                if(arr[i][j]>arr[i][j=1]){
                    a = 1;
                    break;
                }
            }
            if(a==1){
                break;
            }
            if(i+1 < size){
                if(arr[i][j]>arr[i+1][0]){
                    a=1;
                    break;
                }
            }
        }
        for(int i=0; i<size;i++){
            for( j=0; j<size-1 ;j++){
                if(arr[i][j]<arr[i][j=1]){
                    a = 1;
                    break;
                }
            }
            if(a==1){
                break;
            }
            if(i+1 < size){
                if(arr[i][j]<arr[i+1][0]){
                    a=1;
                    break;
                }
            }
        }
        if(a==0){
            System.out.println("Not Sorted");
        }
        else{
            System.out.println("Sorted");
        }
        
    }
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
        isSorted(arr, size);
        sc.close();
    }
}
