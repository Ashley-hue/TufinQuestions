package org.example;

import java.util.*;

public class Main {
    public static List<String> frequentWords(String words){
        TreeMap<String, Integer> sortedWords = new TreeMap<>();//In order to get the words in alphabetical order
        String[] splitWords = words.toLowerCase().split(" ");//split to get individual strings in lowercase
        Map<String, Integer> count = new HashMap<>();//Store the split words
        for(String b : splitWords){
            count.put(b, count.getOrDefault(b, 0) + 1);//store the word and it's frequency
        }
        System.out.println(count);

        int maxValue = (Collections.max(count.values()));//find the word with the highest frequency
        for(Map.Entry<String, Integer> entry : count.entrySet()){
            if(entry.getValue() == maxValue){
                System.out.println(entry.getKey());
                sortedWords.put(entry.getKey(), entry.getValue());//add to sort in alphabetical order
                System.out.println(sortedWords);
            }
        }
        List<String> commonWords = new ArrayList<>(sortedWords.keySet());//store in a list to return keys without the value
        return commonWords;
    }
    public static void main(String[] args) {
        String words = "hi there care to discuss algorithm basis or how to solve algorithm or";
        System.out.println("Count in maps "+ frequentWords(words));

    }
}