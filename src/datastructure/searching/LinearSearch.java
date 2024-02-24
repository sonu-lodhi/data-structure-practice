package datastructure.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {10, 20, 30, 40, 50};
        int target = 40;
        //int index = linearSearch(arr, target);
        int index = binarySearch(arr, target);
        if(index != -1){
            System.out.println("Element found at index: "+index);
        }else{
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[]arr, int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == target){
                return  i;
            }
        }
        return -1;
    };

    public static int binarySearch(int []arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }

        return -1;
    }

}
