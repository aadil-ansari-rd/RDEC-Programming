class InvalidAmountEx extends Exception{
    public InvalidAmountEx(){
        System.out.println("Invalid amount");
    }
}
class MyExp7{
    public void withdraw(int amount){
        int availableBalance = 120000;
        try{
            if(amount>availableBalance){
                throw new InvalidAmountEx();
            }
            else{
                System.out.println("Money Withdraw");
            }
        }
        catch(InvalidAmountEx e){
            System.out.println("Problem handled ");
        }
    }
}
public class Exp7 {
    public static void main(String[] args) {
        System.out.println("Welcome");
        MyExp7 t = new MyExp7();
        t.withdraw(25000);
        System.out.println("Thanks for visit ...");
    }
}
