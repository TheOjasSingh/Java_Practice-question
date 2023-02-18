package Ojas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLast {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int target = 0;
        int n = arr.length;
        List<Integer> arr1=new ArrayList<Integer>();
        int count = 0;
        for(int i = 0;i<n;i++){
            target = arr[i];
            for(int j = 0; j<n;j++){
                if(arr[j]<target){
                    count++;
                }
                arr1.add(count);
            }

        }
        for(Integer Li: arr1){
            System.out.println(arr1);
        }

    }
}
