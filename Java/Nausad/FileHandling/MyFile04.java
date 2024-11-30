import java.io.*;
class DFile04{
    public void inputByte(){
        try{
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            FileOutputStream k = new FileOutputStream("rdRa.txt",true);
            while(true){
                k.write('\n');
                System.out.println("Enter any string is write into file");
                 String s1 = br.readLine();
                 if(s1.equals("stop")){
                 break;
                  }
                else{
                    byte b[]= s1.getBytes();
                     k.write(b );
                     
                }
                
            }
        }
        catch (Exception e){
            System.out.println( "error");
        }
    }
}
public class MyFile04 {
    public static void main(String[] args) {
        DFile04 k = new DFile04();
        k.inputByte();
    }
}

