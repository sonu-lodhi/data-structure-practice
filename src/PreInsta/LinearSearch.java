package PreInsta;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 5, 18, 25, -3, 19};
        int key = 25;
        linearSearchMethod(arr, key);

    }

    private static void linearSearchMethod(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(key+" element found at index "+ i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
