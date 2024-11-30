package Array;

public class Sorting {
    public static void main(String[] args) {
        //int arr[] = { 1, 2, 5, 6, 4, 5, 46, 4, 123, 45 };
        int arr[] = { 1,2,3,4,4,5,6 };
        int a = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] >= arr[j + 1]) {
                a = 1;
            }
            else{
                a=0;
                break;
            }
        }

        int b = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] <= arr[j + 1]) {
                b = 1;
            }
            else{
                b=0;
                break;
            }
        }
        if (a == 0 && b == 0) {
            System.out.println("Array is not sorted");
        } else {
            System.out.println("Array is sorted");
        }

        // for(int i=0;i<arr.length;i++){
        // for(int j =0; j<arr.length;j++){
        // if(arr[j]>arr[j+1]){
        // int c = arr[j];
        // arr[j]=arr[j+1];
        // arr[j+1] = c ;
        // }
        // }
        // }
        // for(int i=0;i<arr.length;i++){
        // for(int j =0; j<arr.length;j++){
        // if(arr[j]<arrji+1]){
        // int c = arr[j];
        // arr[j]=arr[j+1];
        // arr[j+1] = c ;
        // }
        // }
        // }
    }
}
