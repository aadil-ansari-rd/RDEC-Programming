package Recpatterns;
public class PP02 {
    static char ch(char ch , int n){
        if(n==0){
            return ch ;
        }
        System.out.print(ch);
        ch++;
        return (ch(ch, n-1));
    }

    static char inc(char c , int n){
        if(n==0){
            return c;
        }
        char cin = inc(c, n-1);
        return ++cin ;
    }
    static void pat(int row, char ch){
        if(row==0){
            return;
        }
        pat(row-1, ch);
        ch = inc(ch, row);
        ch(ch, row);
        System.out.println();
    }
    public static void main(String[] args) {
        pat(5, 'A');
    }
}
