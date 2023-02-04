package Ojas;

import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(5);
//        list.add(10);
//        list.add(55);
//        list.add(52);
//        list.add(85);
//        list.add(75);
//        System.out.println(list);
//        list.set(0, 0);
//        list.remove(2);
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
//        System.out.println(list); // print list in string format
//        for (int i = 0; i < 5; i++) {
//            System.out.print(list.get(i)); // print list in integer format
//        }
        System.out.println(list.get(2));
    }
}
