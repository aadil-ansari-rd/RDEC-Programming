package Recpatterns;

public class P17 {

    // *********
    //  *******
    //   *****
    //    ***
    //     *
    static void star1(int n , int row){
        if(n==0){
            return;
        }
        star1(n-1, row);
        if(n<row){
            System.out.print("  ");
        }
        else{
            System.out.print("* ");
        }
    }
    static void star2(int n , int row){
        if(n==0){
            return;
        }
        if(n>row){
            System.out.print("* ");
        }
        star2(n-1, row);
    }
    static void pat(int row , int col){
        if(row==0){
            return;
        }
        pat(row-1, col);
        star1(col, row);
        star2(col, row);
        System.out.println();
    }
    public static void main(String[] args) {
        pat(5, 5);
    }

}
