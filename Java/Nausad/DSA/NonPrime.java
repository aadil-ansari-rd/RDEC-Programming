public class NonPrime {
    static int prime(int a){
        if(a<2){
            return 0 ;
        }
        else if(a==2){
            return 1 ;
        }
        else{
            for(int i = 2;i<=a/2; i++){
                if(a%i==0){
                    return 0 ;
                }
                if(i==a/2){
                    return 1;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int array[]={10,7, 12, 9, 7, 13, 17,15, 21 , 56, 45, 7, 29, 29};
        int array2[]=new int[array.length];
        int a2=0 , primeCount=0;
        for(int i =0 ; i< array.length;i++){
            if(prime(array[i])==1){
                primeCount++;
                continue;
            }

            int flag=0;
            for( int j=0; j< i+1;j++){
                if(array2[j]==array[i]){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                array2[a2]=array[i];
                a2++;
            }
        }
        int array2length = array.length-primeCount;
        for (int p=0;p<array2length;p++) {
            System.out.print(array2[p]+"  ");
        }
        
        
    }
}
