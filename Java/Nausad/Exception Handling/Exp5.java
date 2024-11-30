class UserEx extends Exception{
    public UserEx(){
        System.out.println("Exception occured");
    }
}
public class Exp5 {
    static void validate(String s){
        int flag =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='@'){
                flag = 1;
            }
        }
    try{
        if(flag ==0){
            throw new UserEx();
        }
        else{
            System.out.println("Email is correct");
        }
    }
    catch(UserEx e){
        System.out.println("Email is not correct");
    }
    }
    public static void main(String[] args) {
        Exp5 t = new Exp5();
        t.validate("aadil@gmail.com");
    }
}

