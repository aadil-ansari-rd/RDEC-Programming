class SumOfDigit{

    //Sum of digits

    public void digitsum(){
        int sum =0, r , num = 54512;
        while(num!=0){
            r= num%10;
            num= num/10;
            sum = sum + r;
        }
        System.out.println("Sum of digits : "+ sum );
    }


    //Sum of Even-Odd Digit 

    public void evenDigit(){
        int evensum=0 , oddsum=0 , num = 54512 , r;
        while (num!=0) {
            r = num%10;
            num = num/10 ;
            if(r%2==0){
                evensum = evensum + r;
            }
            else{
                oddsum = oddsum + r;
            }
        }
        System.out.println("Even Sum : "+ evensum);
        System.out.println("Odd Sum : "+ oddsum);
    }
    

    //Sum of Prime Digit Number

    public void primeDigitSum(){
        int sum=0 , r , num =54512;
        while (num!=0) {
            r = num %10;
            if(r==2|| r==3|| r==5||r==7){
                sum = sum + r ;
            }   
            num=num/10;                     
        }
        System.out.println("Prime Digit Sum : "+ sum);
    }


    //Sum of all digit of a given number except the digit located on first and last position
    
    public void specialSum(){
        int sum=0 , r , num =54512;
        num = num/10;
        while(num>10){
            r=num%10;
            sum= sum+r;
            num = num/10;           
        }
        System.out.println("Special Sum : " + sum);
    }

    //Sum of first and last digit of a given number 

    public void specialSum2(){
        int sum=0 , num =54512;
        sum= num%10;
        while(num>10){
            num = num/10;           
        }
        sum = sum + num;
        System.out.println("Special Sum 2 : " + sum);
    }

    //

}


public class SumDigitPuzzel{

    public static void main(String[] args) {
        SumOfDigit k = new SumOfDigit();
        k.digitsum();
        k.evenDigit();
        k.primeDigitSum();
        k.specialSum();
        k.specialSum2();
    }
}
