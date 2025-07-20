package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.jar.JarEntry;

public class Main {
    public static String findUniqueProduct(String[] words){
        if(words.length == 0){//base case
            return "";
        }
        int count = 1;

        Map<String, Integer> uniqueWords = new LinkedHashMap<>();//To maintain insertion order
        for(String word : words){
            if(!uniqueWords.containsKey(word)){
                uniqueWords.put(word, count);//only add the words that are not already present in the map
            }
            else{
                uniqueWords.remove(word);//if a duplicate is found, remove the first occurrence of the word from the map
            }
        }
        return uniqueWords.keySet().iterator().next();//return the first word in the map
    }
    public static void main(String[] args) {
        String[] words = {"Apple", "Computer", "Apple", "Bag"};
        System.out.println("Result " + findUniqueProduct(words) );
    }
}