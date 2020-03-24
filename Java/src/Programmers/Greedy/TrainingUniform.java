package Programmers.Greedy;

public class TrainingUniform {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;



        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(reserve[j] - 1 == lost[i] || reserve[j] + 1 == lost[i]){
                    System.out.println(lost[i] + ", " + lost[j]);
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};
        TrainingUniform solution = new TrainingUniform();
        System.out.println(solution.solution(n, lost, reserve));
    }
}
