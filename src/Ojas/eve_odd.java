package Ojas;


import java.util.Scanner;

public class eve_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n%2==0) {
            System.out.println("Even Number");
        }else{
            System.out.println("odd number");
        }
    }
}
