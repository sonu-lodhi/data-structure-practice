package datastructure.searching;

public class SearchingWithAlgorithms {
    public static void main(String[] args) {
        //int []nums ={10,20,30,40,60,50,80,70,90};
        int []nums = new int[112199889];
        nums[112199888] = 900;
        int key = 900;

        //--------Linear Search Methods-----------------
        int index1 = linearSearchWithWhileLoop(nums, key);
        int index2 = linearSearchWithForLoop(nums, key);

        //----------Binary Search Methods----------------
        int index3 = binarySearch(nums, key);
        int index4 = binarySearchRecursion(nums,key,0,nums.length-1);


        if( index4 != -1){
            System.out.println("Element found at index : "+index4);
        }else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearchWithWhileLoop(int []nums, int key){
        int size = nums.length, i = 0, steps = 0;
        while(i<size){
            steps++;
            if(nums[i]==key){
                System.out.println("Steps taken by Linear Using While Loop: "+steps);
                return i;
            }
            i++;
        }
        System.out.println("Steps taken by Linear using While Loop: "+steps);
        return -1;
    }

    public static int linearSearchWithForLoop(int []nums, int key){
        int size = nums.length;
        int steps = 0;
        for (int i = 0; i < size; i++) {
            steps++;
            if(nums[i]==key){
                System.out.println("Steps taken by Linear Using For Loop: "+steps);
                return i;
            }
        }
        System.out.println("Steps taken by Linear Using For Loop: "+steps);
        return -1;
    }

    public static int binarySearch(int []nums, int key){

        int steps=0;
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            steps++;
            int mid = (left+right)/2;

            if(nums[mid]==key){
                System.out.println("Steps taken by Binary : "+steps);
                return mid;
            }
            else if (nums[mid] < key) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        System.out.println("Steps taken by Binary : "+steps);
        return -1;
    }

    public static int binarySearchRecursion(int []nums, int key, int left, int right){
        if(left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == key)
                return mid;
            else if (nums[mid] < key)
                return binarySearchRecursion(nums, key, mid + 1, right);
            else
                return binarySearchRecursion(nums, key, left, mid - 1);
        }
        return -1;
    }
}
