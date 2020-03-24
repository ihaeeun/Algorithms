package Programmers.Hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<Integer, String> lists = new HashMap<>();

        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length; i++) {
            lists.put(i, phone_book[i]);
        }

        for(int i = 1; i < phone_book.length; i++) {
            if(lists.get(i).indexOf(lists.get(0))==0) {
                answer = false;
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String [] phone_book = {"119", "97674223", "1195524421"};
        String [] phone_book2 = {"12232332", "12", "222222"};

        PhoneNumList solution = new PhoneNumList();
        System.out.println(solution.solution(phone_book2));
    }
}
