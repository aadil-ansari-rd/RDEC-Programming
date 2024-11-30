package Recpatterns;

public class PP01 {
    static void ele(int n){
        if(n==0){
            return;
        }
        ele(n-1);
        System.out.print(n);
    }
    static void pat(int row ){
        if(row==0){
            return;
        }
        pat(row-1);
        ele(row);
        System.out.println();
    }
    public static void main(String[] args) {
        pat(5);
    }
}
