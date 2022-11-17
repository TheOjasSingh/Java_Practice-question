package Ojas;

import java.util.Scanner;

public class Average_N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0, count = 0;
        for(int i=1;i<=n;i++){
            sum += i;
            count++;
        }
        int avg = sum / count;
        System.out.println(avg);
    }
}
