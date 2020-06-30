package io.github.w7mikie.sortingAlgorithms;

public class MergeSort {

    public static void main(String[] args) {

        int[] ints = {4, -1, 21, -7, 4, 47};
        mergeSort(ints, 0, ints.length);

        for(int i = 0; i < ints.length; i++){
            System.out.println(ints[i]);
        }
    }

    public static void mergeSort(int[] array, int start, int end) {
        if (end - start < 2){
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end) {
        if (array[mid - 1] <= array[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end){
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}
