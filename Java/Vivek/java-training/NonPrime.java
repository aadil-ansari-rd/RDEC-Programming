public class NonPrime {
    static int nonPrime(int a){
        if(a<2){
            return 1 ;
        }
        if(a==2){
            return 0 ;
        }
        for(int i = 2;i<=a/2; i++){
            if(a%2==0){
                return 0 ;
            }
            if(i==a/2){
                return 1;
            }
        }
        return 1 ;
    }
    public static void main(String[] args) {
        int array[]={10,7, 12, 9, 7, 13, 17,15, 21 , 56, 45, 7, 29, 29};
        int array2[];
        int a2=0 ;
        for(int i =0 ; i< array.length;i++){
            
            for(int j=0; j< i+1;j++){
                if(array2[j]==array[i]){
                    break;
                }
            }
            if(j==i+1){
                int a = nonPrime(array[i]);
                if(a==1){
                    array2[a2]=array[i];
                }
            }
        }
        for (int i : array2) {
            System.out.println(i);
        }
        
    }
}
