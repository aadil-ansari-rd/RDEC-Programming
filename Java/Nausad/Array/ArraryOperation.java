class ArraryOper{
    public void evenOdd(){
        int array[]={ 1, 2, 3, 4, 5, 13, 12, 14, 24, 28};
        int o=0,e=0;
        int odd[]=new int[array.length];
        int even[]=new int[array.length];
        for(int i =0 ;i<array.length;i++){
            if(array[i]%2==0){
                even[e]=array[i];
                e++;
            }
            else{
                odd[o]=array[i];
                o++;
            }
        }
        System.out.print("Even Array : ");
        for(int i=0;i<e;i++){
            System.out.print(even[i] + " ");
        }
        System.out.println();
        System.out.print("Odd Array : ");
        for(int i=0;i<o;i++){
            System.out.print(odd[i]+ " ");
        }
        System.out.println();
    }
    static int checkPrime(int n){
        int check = 1;
        if(n<2){
            check=0;
        }
        else if(n==2){
            check = 1;
        }
        else{
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    check = 0;
                }
            }
        }
        return check;
    }
    public void prime(){
        int array[]={ 1, 2, 3, 4, 5, 13, 12, 14, 24, 28};
        int p=0;
        int prime[]=new int[array.length];
        for(int i=0;i<array.length;i++){
            if(checkPrime(array[i])==1){
                prime[p]=array[i];
                p++;
            }
        }
        System.out.print("Prime Number Array : ");
        for(int i=0;i<p;i++){
            System.out.print(prime[i]+" ");
        }
    }
    public void sort(){
        int array[]={  13, 12, 14,1, 2, 3, 4, 5, 24, 28};
        for(int i=0;i<array.length-1;i++){
            for(int j = 1 ; j<array.length;i++){
                if(array[i]>array[j]){
                    array[i]=array[i]*array[j];
                    array[j]=array[i]/array[j];
                    array[i]=array[i]/array[j];
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
public class ArraryOperation {
    public static void main(String[] args) {
        ArraryOper a = new ArraryOper();
        a.evenOdd();
        a.prime();
        a.sort();
    }
}
