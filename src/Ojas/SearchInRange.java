package Ojas;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={19, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length==0) return -1;
        for (int i = start; i < end; i++) {
            int element = arr[i];
            //check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }
        //this line will execute of none of the above statement is executed
        //hence the target
        return -1;
    }
}
