package Hash.notFinishedPlayer;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public String solution(String[] participant, String[] completion) {
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
}
