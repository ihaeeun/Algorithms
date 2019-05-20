package Camouflage;

public class Main {
    public static void main(String[] args) {
//        String clothes[][] = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String clothes[][] = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        Solution solution = new Solution();
        System.out.println(solution.solution(clothes));
    }
}
