package Ojas;

import java.util.Scanner;

public class max_num {
    public static void main(String[] args) {
        Scanner CM = new Scanner(System.in);
        int b = CM.nextInt();
        int a = CM.nextInt();
        if(a>b){
            System.out.print(a+"is the largest number");
        }else{
            System.out.print(b+"is the largest number");
        }
    }
}
