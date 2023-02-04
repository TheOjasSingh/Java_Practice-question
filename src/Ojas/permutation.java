package Ojas;

import java.util.Arrays;

public class permutation {
    public static void main(String[] args) {
//        int[] num = {1,2,3,4};
//        int n = num.length;
//        int[] ans = new int[n];
////        for(int i=0; i<num.length;i++){
////            ans[i] = num[num[i]];
////        }
////        for(int i=0; i<n;i++){
////            for(int j=0;j<=i;j++){
////                ans[i]+=num[j];
////            }
////        }
////        int i=0, j=0;
////        while(i<n){
////            do {
////                ans[i]+=num[j];
////                j++;
////            }while(j<i);
////            i++;
////        }
//
//        System.out.println(Arrays.toString(ans));

//        int[][] num= {
//                {1,2,3},
//                {3,2,4}
//        };
//        int sum = 0;
//        int ans[] = new int[num.length];
//        for(int i=0;i<num.length;i++){
//            for(int j=0;j<num[i].length;j++){
//                sum+=num[i][j];
//            }
//            ans[i]=sum;
//            sum=0;
//        }
//        int max = ans[0];
//        int i=0;
//        while(i<ans.length){
//            if(ans[i]>max){
//                max=ans[i];
//            }
//        }
//        System.out.println(Arrays.toString(ans));
//        System.out.print(max);
        int[] arr={2,5,1,3,4,7};
        int n = arr.length;
        int[] arr1 = new int[n/2];
        int[] arr2 = new int[n-(n/2)];
        for(int i =0;i<n/2;i++){
            arr1[i]=arr[i];
        }
        for(int i=0;i<(n-(n/2));i++){
            arr2[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
