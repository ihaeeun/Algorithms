package StackQueue.Printer;

import java.util.*;

public class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Map<String, Integer> prints = new HashMap<String, Integer>();

        for(int i = 0; i < priorities.length; i++){
            prints.put(String.valueOf(i), priorities[i]);
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<>(prints.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int comparision = (o1.getValue() - o2.getValue()) * -1;
                return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision;
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for(Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext();){
            Map.Entry<String, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedMap);

        answer = sortedMap.get(String.valueOf(location + 1));

        return answer;
    }
}
