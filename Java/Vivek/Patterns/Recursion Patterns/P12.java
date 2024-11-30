package Recpatterns;

public class P12 {
    
    // ****
    //  *  *
    //   *  *
    //    ****

    static void star1(int n , int row , int con ){
        if(n==0){
            return;
        }
        star1(n-1, row, con);
        if(row>n){
            System.out.print("  ");
        }
        else{
            if(row==1 || n==row){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }        
    }
    static void star2(int n,int row, int con){
        if(n==0){
            return;
        }
        star2(n-1, row, con);
        if(row>n){
            if(row==con || n==(row-1)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        

    }
    static void pat(int row, int col){
        if(row==0){
            return;
        }
        pat(row -1, col);
        star1(col, row,col);
        star2(col, row, col);
        System.out.println();
    }

    public static void main(String[] args) {
        pat(5, 5);
    }
}
