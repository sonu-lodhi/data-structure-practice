package datastructure.sorting;

public class SelectionSortJ1 {
    static  void sort(int[] arr){
        int max = arr[arr.length-1];
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]>=max){
                max=arr[i];
                arr[i] = -1;
            }else {
                arr[i] =max;
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {12, 55, 66, 99, 45, 16, 23, 18};
        sort(arr);
        for (int element:arr) {
            System.out.print(element+" ");
        }
    }
}
