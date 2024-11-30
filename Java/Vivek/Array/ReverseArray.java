package Array ;
public class ReverseArray {
    static void rev(int[] arr){
        int i =0 ;
        int ar[]= arr ;
        int j = ar.length;
        int l = ar.length;
        while(i>j){
            ar[i]=ar[i]+ar[j];
            ar[j]=ar[i]-ar[j];
            ar[i]= ar[i]-ar[j];
            i++;
            j--;
        }
        for(i=0;i<l;i++){
            System.out.print(ar[i] + "  ");
        }
        
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 145, 153, 46, 4, 123, 45 };
        rev(arr);
    }
}
