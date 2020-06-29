package io.github.w7mikie.sortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {

    }

    static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
