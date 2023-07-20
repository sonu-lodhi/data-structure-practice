package basicprogram;

public class FindMissingNum {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,3,7,8};
        int n=7;
        int miss = getMissingNum(arr, n);
        System.out.print(miss);
    }

    static int getMissingNum(int[] arr, int n) {
        int i, total;
        total = (n+1) * (n+2) / 2;
        for(i=0; i<n; i++){
            total -= arr[i];
        }
        return total;
    }
}
