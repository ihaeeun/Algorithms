package Programmers.Hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class notFinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;

        for(i = 0 ; i < participant.length - 1; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }


    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();

        for (String finisher : participant) {
            if(participantMap.containsKey(finisher)){
                int flag = participantMap.get(finisher);
                participantMap.put(finisher, flag + 1);
            } else {
                participantMap.put(finisher, 1);
            }
        }

        for (String finisher : completion) {
            int flag = participantMap.get(finisher);
            participantMap.put(finisher, flag - 1);
        }

        for (String finisher : participant) {
            if (participantMap.get(finisher) != 0) {
                answer = finisher;
                break;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        String [] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String [] complement = {"josipa", "filipa", "marina", "nikola"};

        notFinishedPlayer solution = new notFinishedPlayer();
        System.out.println(solution.solution(participant, complement));
        System.out.println(solution.solution2(participant, complement));
    }
}