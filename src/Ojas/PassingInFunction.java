package Ojas;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] numbs = {3, 5, 6, 7};
        System.out.println(Arrays.toString(numbs));
        change(numbs);
        System.out.println(Arrays.toString(numbs));
    }
    static void change(int[] arr){
        arr[0]=99;
        arr[3]=97;
    }
}
