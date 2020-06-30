package io.github.w7mikie.sortingAlgorithms;

public class QuickSort {

    public static void main(String[] args) {
        int[] ints = {-1, 4, 10, -5, 4};

        quickSort(ints, 0, ints.length);

        for (int i = 0; i < ints.length; i++){
            System.out.println(ints[i]);
        }
    }

    public static void quickSort(int[] array, int start, int end){
        if (end - start < 2){
            return;
        }

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    public static int partition(int[] array, int start, int end) {
            int pivot = array[start];
            int i = start;
            int j = end;

            while (i < j) {

                while (i < j && array[--j] >= pivot);
                    if (i < j){
                        array[i] = array[j];
                    }

                while (i < j && array[++i] <= pivot);
                    if (i < j){
                        array[j] = array[i];
                    }
            }

            array[j] = pivot;
            return j;
    }
}
