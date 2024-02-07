package collectionframework.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MySplitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int []array = {1,2,5,5,4,4,7,8,9,6,3,2,1,5,6,8,9};
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("Enter the Element to store in Array");
        int j=0;
        while(j<size) {
            array[j] = sc.nextInt();
            j++;
        }
        System.out.println("Entered Elements in the array : "+ Arrays.toString(array));
        System.out.println("Enter the split size : ");
        int splitSize = sc.nextInt();
        Arrays.sort(array);
        List<List<Integer>> result = theSplitArray(array, splitSize);
        System.out.println("Count total number of sub list is : "+result.size());
        System.out.println("All Sub Lists into the List : "+result);
        for (List<Integer> list:result) {
            System.out.println(list);
        }
    }

    private static List<List<Integer>> theSplitArray(int []array, int splitSize){
        List<List<Integer>> list = new ArrayList<>();
        int i=0;
        while(i<array.length){
            List<Integer> subList = new ArrayList<>();

            for (int j = 0; j < splitSize; j++) {
                int k = i+j;
                if(k<array.length){
                    subList.add(array[k]);
                }
            }
            list.add(subList);
            i+=splitSize;
        }

        return list;
    }
}
