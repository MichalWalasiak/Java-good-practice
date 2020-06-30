package io.github.w7mikie.sortingAlgorithms;

public class QuickSort {

    public static void main(String[] args) {

    }

    public static int partition(int[] array, int start, int end) {
            int pivot = array[start];
            int i = start;
            int j = end;

            while (i < j) {

                while (i < j && array[--j] >= pivot) {
                    if (i < j){
                        array[i] = array[j];
                    }
                }

                while (i < j && array[++i] <= pivot) {
                    if (i < j){
                        array[j] = array[i];
                    }
                }

            }

            array[j] = pivot;
            return j;
    }
}
