package io.github.w7mikie.arrays;

public class PrintArrayAfterSomeOperations {

    public static void main(String[] args) {

        int [] ints = {4, 8, 12, 16};
        printArray(ints, ints.length, 4);

    }

    static void printArray(int[] array, int n, int k) {

        int minEle = Integer.MAX_VALUE,
            maxEle = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            minEle = Math.min(minEle, array[i]);
            maxEle = Math.max(maxEle, array[i]);
        }

        if (k != 0){
            if (k % 2 == 1){
                for (int i = 0; i < n; i++) {
                    array[i] = maxEle - array[i];
                }
            }
            else{
                for (int i = 0; i < n; i++) {
                    array[i] = array[i] - minEle;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
