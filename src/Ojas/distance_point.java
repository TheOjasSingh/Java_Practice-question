package Ojas;

import java.util.Scanner;

public class distance_point {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1 and y1");
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        System.out.println("Enter x2 and y2");
        int y1 = in.nextInt();
        int y2 = in.nextInt();
        double distance = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        System.out.println("Distance between Two points :"+distance);
    }
}
