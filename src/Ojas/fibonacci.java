package Ojas;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner fib = new Scanner(System.in);
        int n = fib.nextInt(), n1 = 0, n2 = 1;
        System.out.print("fibnoic series till "+n);
        for(int i=1;i<=n;i++){
            System.out.print(n1+" ");
            int n3 = n1+n2;
            n1= n2;
            n2= n3;
        }
    }
}
