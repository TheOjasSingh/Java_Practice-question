package Ojas;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//
//
//        //System.out.println(arr[0]);
//        for(int i=0;i<arr.length;i++){
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));
//        for (int x = 0; x < arr.length; x++) {
//            System.out.println(arr[x]);
//        }

//        for (int num : arr){
//            System.out.println(num + " ");
//        }
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
