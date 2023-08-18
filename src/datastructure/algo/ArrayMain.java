package datastructure.algo;

import java.util.Arrays;

public class ArrayMain {

    public static void stringSorting(){
        String[] fruits = {"Apple", "Banana","Mango","Orange", "Grape", "Lemon"};
        Arrays.sort(fruits);
        System.out.println("Array After Sorting : "+ fruits);
    }

    public static void integerSorting(){
       int[] numbers = {1,2,3,5,4,6,8,7,8,9,0};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void main(String[] args) {
        integerSorting();
    }
}
