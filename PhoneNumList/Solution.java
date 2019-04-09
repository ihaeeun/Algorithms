package PhoneNumList;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<Integer, String> lists = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++) {
            lists.put(i, phone_book[i]);
        }
        System.out.println(lists);

        int len = lists.get(0).length();

        for(int i = 1; i < phone_book.length; i++) {

            if(lists.get(i).indexOf(lists.get(0))==0) {
                answer = false;
                return answer;
            }
        }

        return answer;
    }
}
