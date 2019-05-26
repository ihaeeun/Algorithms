package Hash.notFinishedPlayer;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String [] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String [] complement = {"josipa", "filipa", "marina", "nikola"};

        Solution solution = new Solution();
        System.out.println(solution.solution(participant, complement));

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(participant, complement));
    }
}
