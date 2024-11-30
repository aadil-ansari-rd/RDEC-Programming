package Array;

import java.util.ArrayList;

public class CheckStringSubSeq {
    static ArrayList<String> findSubSeq(String str) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char singlChar = str.charAt(i);
            int listSize = list.size();
            if (listSize == 0) {
                list.add("");
                list.add(singlChar + "");
                continue;
            }

            for (int j = 0; j < listSize; j++) {
                String temp = list.get(j) + singlChar;
                list.add(temp);

            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(findSubSeq("adil"));
    }
}
