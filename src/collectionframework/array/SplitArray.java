package collectionframework.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
        int[]arr = {2,3,6,5,3,5,4,8,1,5};
        Scanner sc = new Scanner(System.in);

        int splitSize = 3;
        List<List<Integer>> result = splitArray(arr, splitSize);
        for(List<Integer> list: result) {
            System.out.println(list);
        }
    }
    static List<List<Integer>> splitArray(int[]array, int splitSize){
        /*List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        int length = array.length;*/
       // int startIndex = 0;

        /*for (int i = 0; i < length; i++) {
            if(i<3) {
                list1.add(array[i]);
            }else if (i>=3 && i<6){
                list2.add(array[i]);
            }else if(i>=6 && i<9){
                list3.add(array[i]);
            } else if (i>=9 && i<length) {
                list4.add(array[i]);
            }
        }*/
       /* list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
*/

        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        while(i < array.length) {
            List<Integer> subList = new ArrayList<>();
            for(int j = 0; j < splitSize; j++) {
                int k = i+j;
                if(k < array.length) {
                    subList.add(array[k]);
                }
            }
            list.add(subList);
            i += splitSize;
        }


        return list;
    }
}
