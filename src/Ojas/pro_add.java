package Ojas;

import java.util.Scanner;

public class pro_add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int add = 0, m = 1;
        int n = in.nextInt();
        while(n>0){
            int rem = n%10;
            add+=rem;
            m*=rem;
            n/=10;
        }
        int ans = m - add;
        System.out.println(ans);
    }
}
