package HW1;

public class IsSorted {
    public static void main(String[] args) {
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
    }
}
