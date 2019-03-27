package notFinishedPlayer;

import java.util.Arrays;

public class Solution {
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
}