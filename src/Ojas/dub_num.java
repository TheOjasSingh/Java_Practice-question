package Ojas;

import java.util.Scanner;

public class dub_num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a;
        int n = scan.nextInt();
        a = new Int[n];
        for(int i =0;i<=n;i++){
            a[i] = scan.nextInt();
        }
        for(i =0;i<=n;i++){
            if(a[i]==a[i+1]){
                System.out.println("true");
            }
        }
    }
}
