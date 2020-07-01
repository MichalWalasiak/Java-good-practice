package io.github.w7mikie.sortingAlgorithms;

public class CountingSort {

    public static void main(String[] args) {

        int[] ints = {4, 8, 15, 21, 4, 7, 98};

        countingSort(ints, 1, 98);

        for (int i = 0; i < ints.length; i++){
            System.out.println(ints[i]);
        }

    }

    public static void countingSort(int[] array, int min, int max) {
            int[]countArray = new int[max - min + 1];

            for (int i = 0; i < array.length; i++){
                countArray[array[i] - min]++;
            }

            int j = 0;

            for (int i = min; i <= max; i++){
                while (countArray[i - min] > 0){
                    array[j++] = i;
                    countArray[i - 1]--;
                }
            }
    }
}
