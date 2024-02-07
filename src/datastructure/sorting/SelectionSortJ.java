package datastructure.sorting;

public class SelectionSortJ {
    static  void sort(int[] arr){
        for(int i = 0; i < arr.length ; i++) {
           int miniIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[miniIndex]>arr[j]){
                    miniIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[miniIndex];
            arr[miniIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int []arr = {17, 23, 44, 4, 19, 12};
        sort(arr);
        for (int element:arr) {
            System.out.print(element+" ");
        }
    }
}
