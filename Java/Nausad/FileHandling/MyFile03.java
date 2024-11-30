import java.io.*;
class DFile03{
    public void inputByte(){
        try{
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            FileOutputStream k = new FileOutputStream("ram.txt");
            System.out.println("Enter any string is write into file");
            String s1 = br.readLine();
            byte b[]= s1.getBytes();
            k.write(b );
        }
        catch (Exception e){
            System.out.println( "error");
        }
    }
}
public class MyFile03 {
    public static void main(String[] args) {
        DFile03 k = new DFile03();
        k.inputByte();
    }
}
