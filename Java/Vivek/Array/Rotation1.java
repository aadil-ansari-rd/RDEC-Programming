package Array;

public class Rotation1 {
    static void rot(int[] arr ){
        int l = arr.length;
        int val= arr[l-1];
        for(int i =l-1 ;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=val;
        for(int i=0;i<l;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 4, 5, 46, 4, 123, 45 };
        rot(arr);
        
    }
}
