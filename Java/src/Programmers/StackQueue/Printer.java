package Programmers.StackQueue;

import java.util.*;

//class Print {
//    int priorities;
//    int location;
//
//    Print(int priorities, int location){
//        this.priorities = priorities;
//        this.location = location;
//    }
//}

public class Printer {
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

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

//        int[] priorities = {1, 1, 9, 1, 1, 1};
//        int location = 0;

        Printer printer = new Printer();
        System.out.println(printer.solution(priorities, location));
    }
}
