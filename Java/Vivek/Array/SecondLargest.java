package Array;

public class SecondLargest {
    static int large(int arr[]){
        int lar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar ;
    }

    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 4, 5, 46, 4, 123, 45 };
        int largest = large(arr);
        for(int i=0 ; i<arr.length; i++){
            if(arr[i]==largest){
                arr[i]=0;
            }
        }
        System.out.println("Second Largest Number Is : " + large(arr));
    }
}
