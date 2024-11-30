package Recpatterns;

public class P16 {

    //     *
    //    * *
    //   *   *
    //  *     *
    // ********* 
    static void star1(int n , int row ,int con){
        if(n==0){
            return;
        }
        
        if(n>row){
            System.out.print("  ");
        }
        else{
            if(n==row || row==con){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        star1(n-1, row, con);
    }
    static void star2(int n , int row, int con){
        if(n==0){
            return;
        }
        star2(n-1, row, con);
        if(n<row){
            if(n==(row-1) || row== con ){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
    }
    static void pat(int row , int col){
        if(row==0){
            return;
        }
        pat(row-1, col);
        star1(col, row , col);
        star2(col, row , col);
        System.out.println();
    }
    public static void main(String[] args) {
        pat(5, 5);
    }
}
