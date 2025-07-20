package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static String longestString(List<Character> chars, List<String> letters){
        if(chars.size() == 0 || letters.size() == 0){//base case
            return "";
        }
        //find out if letters are duplicates next to each other
        //find out if all the letters exist in list of characters
        //find the longest one
        //Avoid nested for loops
        int stringLength = 0; //to find the length of the longest string
        String longest = "";//initializing the String

        for(String letter : letters){
            if(!noDupes(letter) && exists(chars, letter)){//if the word has no duplicates and all letters exist in characters given
                if(letter.length() > stringLength){
                    stringLength = letter.length();//save the length of the longest string
                    longest = letter;
                }
            }
        }
        return longest;//and return it
    }

    public static boolean noDupes(String letter){//noDupes = noDuplicates
        for(int i = 1; i < letter.length(); i++){
            if(letter.charAt(i) == letter.charAt(i-1)){//if the letter in the first position is the same as the one in the previous position,
                return true;// return true to mean a duplicate was found
            }
        }
        return false;//a duplicate was not found
    }
    public static boolean exists(List<Character> chars, String letters){
        for(char ch : chars){
            if(letters.contains(String.valueOf(ch))){//check if all the letters are found in the characters given
                return true;//verify that it is there
            }
        }
        return false;//there was no character match for all the letters that were found
    }

    public static void main(String[] args) {
        List<Character> chars = Arrays.asList('A', 'B', 'C', 'D');
        List<String> letters = Arrays.asList("AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABCDA");
        String longest = longestString(chars, letters);
        System.out.println(longest);
    }
}