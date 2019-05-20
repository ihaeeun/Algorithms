package Camouflage;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> spy = new HashMap<>();

        for (String[] cloth : clothes) {
            if (spy.containsKey(cloth[1])) {
                spy.put(cloth[1], spy.get(cloth[1]) + 1);
            } else {
                spy.put(cloth[1], 1);
            }
        }

        for (int value : spy.values()) {
            answer *= value + 1;
        }

        return answer - 1;
    }
}
