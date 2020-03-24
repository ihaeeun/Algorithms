package Programmers.Hash;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays){
        int[] answer = {};

        Map<String, Integer> genreTotalMap = new HashMap<>();
        Map<Integer, String> genreMap = new HashMap<>();
        Map<Integer, Integer> playMap = new HashMap<>();
        List<Map.Entry<String, Integer>> list = new LinkedList<>();


        for(int i = 0; i < genres.length; i++){
            if(!genreTotalMap.containsKey(genres[i])){
                genreTotalMap.put(genres[i], plays[i]);
            } else {
                genreTotalMap.put(genres[i], genreTotalMap.get(genres[i]) + plays[i]);
            }
            genreMap.put(i, genres[i]);
            playMap.put(i, plays[i]);
        }
        System.out.println(genreTotalMap);
        System.out.println(genreMap);
        System.out.println(playMap);
        System.out.println("------------");

        List<Map.Entry<Integer, String>> genreList = new LinkedList<>(genreMap.entrySet());
        Collections.sort(genreList, (Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) -> o1.getValue().compareTo(o2.getValue()));
        List<Map.Entry<Integer, Integer>> playList = new LinkedList<>(playMap.entrySet());
        Collections.sort(playList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                int comparison = (o1.getValue() - o2.getValue()) * -1;
                return comparison == 0 ? o1.getKey().compareTo(o2.getKey()) : comparison;
            }
        });
        System.out.println(genreList);
        System.out.println(playList);
        System.out.println("------------");

        for(int i = 0; i < genreList.size(); i++){
            if
        }

        return answer;
    }



    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        BestAlbum solution = new BestAlbum();
        System.out.println(Arrays.toString(solution.solution(genres, plays)));
    }
}
