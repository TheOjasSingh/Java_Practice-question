package Ojas;

import java.util.Scanner;

public class simp_int {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int T = input.nextInt();
        int R = input.nextInt();
        int S = ((P*T*R)/100);
        System.out.println("Simple Interest : "+ S);
    }
}
