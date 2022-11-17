package Ojas;

import java.util.Scanner;

public class Sum_Of_All {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum= 0, i = 1;
        while(n>0){
            System.out.println(n);
            sum+=i;
            i++;

        }
        System.out.println(sum);
    }
}
