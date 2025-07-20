package org.example;

import java.util.*;

public class Main {
    public static int uniqueSums(int result, int[] arr){
        //add the numbers in array to find result
        //Identify unique ones
        //I couldnt implement the result on time but the idea was:

        Set<List<Integer>> uniqueList = new HashSet<>();//Create a set to add unique lists
        List<Integer> uniqueElements = new ArrayList<>();//In order to be able to use the set and allow different lengths of lists

        for (int i = 0; i < arr.length; i++) {
            int a = result - arr[i];//Subtract from result till you get a zero
            if(a != 0 && !(a<0)){ //while the a hasn't hit zero,
                uniqueElements.add(arr[i]);//continue adding elements from arr into the list
                System.out.println("List elements "+uniqueList);//verification
            }
            if(a == 0){//when you get to zero,
                uniqueList.add(uniqueElements);//add everything that was inside list to the set
            }

            System.out.println("Set elements "+uniqueList);
        }
        return uniqueList.size();//best way to find the unique combinations
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result = 10;
        System.out.println("Final result "+uniqueSums(result, arr));
    }
}