package Ojas;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if(arr.length==0) return -1;
        for (int element : arr) {
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
