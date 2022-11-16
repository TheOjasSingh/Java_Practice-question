package Ojas;

import java.util.Scanner;

public class choice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans = 0;
        System.out.println("Please enter your choice:(+,-,/,*)");
        char c = input.next().charAt(0);
        if (c == '+') {
            ans = num1 + num2;
            System.out.println(ans);
        } else if (c == '-') {
            ans = num1 - num2;
            System.out.println(ans);
        } else if (c == '*') {
            ans = num1 * num2;
            System.out.println(ans);
        } else {
            ans = num1 / num2;
            System.out.println(ans);
        }
    }
}
