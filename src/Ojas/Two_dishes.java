package Ojas;

import java.util.Scanner;

public class Two_dishes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int count = 0;
        for(int i = 0;i<T;i++){
            int N = scan.nextInt();
            int S = scan.nextInt();
            for(int m = 0;m<N;m++){
                for(int n = 0;n<N;n++){
                    if((m+n)==S){
                        count++;
                    }
                }
            }
            System.out.print(count);
        }
    }
}
