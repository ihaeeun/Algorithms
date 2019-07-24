package Programmers.Hash;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {
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

    public static void main(String[] args) {
//        String clothes[][] = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String clothes[][] = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        Camouflage solution = new Camouflage();
        System.out.println(solution.solution(clothes));
    }
}
