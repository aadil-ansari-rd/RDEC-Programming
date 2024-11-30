import java.util.ArrayList;
import java.util.Scanner;

public class StringSubSeq {
    static ArrayList<String> findSeq(String name){
        ArrayList<String> list = new ArrayList<>();
        for(int i =0 ;i <name.length();i++){
            char ch = name.charAt(i);
            int listSize = list.size();
            if(listSize==0){
                list.add("");
                list.add(ch + "");
                continue;
            }
            for(int j=0; j<listSize;j++){
                String temp = list.get(j)+ ch;
                list.add(temp);

            }
            
        }
        return list ;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println(findSeq(name));
        sc.close();
    }
}
