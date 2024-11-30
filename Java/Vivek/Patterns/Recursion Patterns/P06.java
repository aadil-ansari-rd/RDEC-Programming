package Recpatterns;

public class P6 {
    // * * * * * 
    // *     *
    // *   *
    // * *
    // *
    static void star(int n,int c){
        if(n==0){
            return;
        }
        star(n-1, c);
        if(n==1 || n==c || c==5){
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }
        
    }
    static void pat(int r , int c){
        if(r==0){
            return;
        }
        
        star(r,c);
        System.out.println();
        pat(r-1, c-1);
    }
    public static void main(String[] args) {
        pat(5, 5);
    }
}
