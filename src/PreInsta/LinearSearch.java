package PreInsta;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 5, 18, 25, -3, 19};
        int item = 25;
        linearSearchMethod(arr, item);

    }

    private static void linearSearchMethod(int[] arr, int item) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println(item+" element found at index "+ i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
