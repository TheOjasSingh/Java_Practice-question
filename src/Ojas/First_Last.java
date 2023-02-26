package Ojas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class First_Last {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,7,8,8,10};
        int target = 7;
//        int[] result = search(arr, target);
        System.out.println(Arrays.toString(search(arr, target)));
    }
    // Brute Force method
//    static int[] search(int[] arr, int target){
//        int[] ans = new int[] {-1, -1};
//        for(int i =0;i<arr.length;i++){
//            if(arr[i] == target){
//                ans[0] = i;
//                break;
//            }
//        }
//        for(int i = arr.length-1;i>=0;i--){
//            if(arr[i] == target){
//                ans[1] = i;
//                break;
//            }
//        }
//        return ans;
//    }

    // Optimized method using Binary Search
    static int[] search(int[] arr, int target){
        int[] ans = {-1, -1};
        int start = search1(arr, target, true);
        int end = search1(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search1(int[] arr, int target, boolean findstartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid -1;
            }else if( target > arr[mid]){
                start = mid + 1;
            } else{
                ans = mid;
                if(findstartIndex){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
