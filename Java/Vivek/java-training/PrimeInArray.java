class MyPrime{
    public void show(){
        int a[]={1, 2,10,7,8,9,13,17};
        int count =0;
        for(int i=0; i<a.length;i++){
            //2 se lekar number ke half tk ke number se divide krke dekhenge
            int flag = 1;
            for(int j=2;j<(a[i]/2);j++){
                if(a[i]<2){
                    flag = 0 ;
                }
                else if(a[i]==2){
                    break;
                }
                else if(a[i]%j==0){
                    flag =0;
                    break;
                }
            }
            if(flag==1){
                System.out.println(a[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
public class PrimeInArray {
    public static void main(String[] args) {
        MyPrime a = new MyPrime();
        a.show();
    }
}
