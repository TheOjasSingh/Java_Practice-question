package Ojas;

import java.util.Scanner;

public class int_usd {
    public static void main(String[] args) {
        Scanner Money = new Scanner(System.in);
        int inr = Money.nextInt();
        double convert = inr*0.012415;
        System.out.print(convert+" USD");

    }
}
