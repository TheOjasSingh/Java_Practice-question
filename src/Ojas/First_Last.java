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
    static int[] search(int[] arr, int target){
        int[] ans = new int[] {-1, -1};
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                ans[0] = i;
                break;
            }
        }
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i] == target){
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}
