package datastructure;

import java.util.Arrays;

//Given an array of integers, write a java 8 program to find the second-smallest element.
//Input : int[] numbers = {5,2,8,3,1};
public class Java8ArrayProblems {
    public static void main(String[] args) {
        int[] numbers = {5,2,8,3,1};
        fetchSecondSmallest(numbers);
    }

    private static void fetchSecondSmallest(int[] arr) {
        int secondSmallestElement = Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException("Array does not have a second smallest element."));
        System.out.println(secondSmallestElement);
    }

}
