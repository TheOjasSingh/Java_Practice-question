package Ojas;

public class EvenDigit {
    public static void main(String[] args) {
        int[] num = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(num));
        int max = num[0];
        for (int i = 1; i < num.length; i++)
            if (num[i] > max) {
                max = num[i]; // update the maximum if a larger value is found
            }
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numerologists = digit(num);
        return numerologists % 2 == 0;
    }
    static int digit(int num){
        int count =0;
        while(num>0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
