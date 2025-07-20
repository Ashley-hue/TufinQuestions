package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int findDistance(int[] arr){
        int mini = Integer.MAX_VALUE;//store the largest value to later find the actual value
        List<Integer> indices = new ArrayList<>();//list to store indices to perform subtraction later
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < a){
                a = arr[i];//find the smallest digit and store it
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == a){
                indices.add(i);//add all the indices where the number was found
            }
        }
        for(int i = 0; i<indices.size() - 1; i++){
            int subtract = indices.get(i + 1) - indices.get(i);//subtract the indices two by two
            mini = Math.min(mini, subtract);//store the smallest value
        }
        return mini;//return it
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,5,2};
        System.out.println("Result: " + findDistance(arr));
    }
}