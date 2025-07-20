package org.example;

public class Main {
    public static int findOperations(int[] arr ){
        if (arr[0] == 0){//if the first position of array is zero it won't achieve the desired result
            return 0;
        }

        //From how I understood the question, the goal was to return an array whose elements after index 1 were 0

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i] - arr[i];//in order to achieve this, you can subtract the number from itself
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("Result: " + findOperations(arr));
    }
}