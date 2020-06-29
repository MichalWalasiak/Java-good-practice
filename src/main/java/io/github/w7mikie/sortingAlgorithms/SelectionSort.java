package io.github.w7mikie.sortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {

        int[] ints = {4, -5, 45, 1, 4, -74};

        for(int lastUnsortedIndex = ints.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (ints[i] > ints[largest]){
                    largest = i;
                }
            }
            swap(ints, largest, lastUnsortedIndex);
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

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
