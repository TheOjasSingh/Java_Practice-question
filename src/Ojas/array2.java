package Ojas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,3};
        int n = arr.length;
        String[] arr1= new String[n];
        int max_c=0;
        for(int i=0;i<n;i++){
            max_c=Math.max(max_c,arr[i]);
        }
        System.out.println(max_c);
        for(int i=0;i<n;i++){
            if((arr[i]+n)>=max_c){
//                System.out.println(arr[i]+max_c);
                arr1[i]="true";
            }else{
                arr1[i]="false";
            }
        }

        System.out.println(Arrays.toString(arr1));
    }
}
