package HW1;

public class LowestNumber {
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
        int arr[] = { 1, 2, 5, 6, 4, 5, 46, 4, 123, 45 };
        System.out.println("Smallest Number Is : " + smallest(arr));
        
    }
}
