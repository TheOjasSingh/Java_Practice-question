package Ojas;

public class Max_Min {
    public static void main(String[] args) {
        int[] A = {1, 3, 4, 1};
        System.out.println(ans(A, 4));
    }
    static int ans(int[] A, int N){
        int max = A[0];
        int min = A[0];
        for(int i = 0 ; i < N; i++){
            if(A[i] > max){
                max = A[i];
            }
            if(A[i] < min){
                min = A[i];
            }
        }
        return max+min;

    }
}
