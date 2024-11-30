package ForPatterns;

public class P12 {
    
    // ****
    //  *  *
    //   *  *
    //    ****

    public static void main(String[] args) {
        int i , j , k  ;   
        for(i=1;i<=4;i++){
            for(j=1;j<=i-1;j++){ 
                System.out.print("  ");       
            }
            for(k=1;k<=4;k++){
                if(k==1|| i==1 || i==4 || k==4){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
    }
}
