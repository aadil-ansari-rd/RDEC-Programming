// Write a program to append vowels from a string to another but only those
// vowel that come after m in alphabet .

class Append{
    public void show(){
        String name ="mohan is a good guy";
        String name1 = "";
        for(int i = 0;i<name.length();i++){
            char p = name.charAt(i);
            if(p=='o'||p=='u'){
                name1 =  name1 + p;
            }
        }
        System.out.println(name1);
    }
}
public class CountVowelAfterMInStr {
    public static void main(String[] args) {
        Append a = new Append();
        a.show();
    }
}
