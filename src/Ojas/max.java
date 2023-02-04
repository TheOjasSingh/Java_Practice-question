package Ojas;

public class max {
    public static void main(String[] args) {
        int [] arr={12,5,4,7,8};
        System.out.println(max(arr));
    }
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = start;
        for (int i = start; i < end; i++) {
            maxVal = arr[i];
        }
        return maxVal;
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxVal = arr[i];
        }
        return maxVal;
    }
}
