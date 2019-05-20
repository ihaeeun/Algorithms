package HIndex;

public class Main
{
    public static void main(String[] args) {
//        int [] citations = {3, 0, 6, 1, 5};
        int [] citations = {10, 55, 100};
        Solution solution = new Solution();
        System.out.println(solution.solution(citations));
    }
}
