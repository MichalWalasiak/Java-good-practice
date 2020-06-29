package io.github.w7mikie.sortingAlgorithms;

public class InsertionSort {

    public static void main(String[] args) {

        int[] ints = {-4, 24, -7, 4, 7, 4};
        insertionSort(ints, ints.length );

        for (int i = 0; i < ints.length; i++){
            System.out.println(ints[i]);
        }

    }

    static void insertionSort(int[] array, int numItem) {
        if (numItem < 2){
            return;
        }
        insertionSort(array, numItem - 1);
        int newElement = array[numItem - 1];
        int i;
        for(i = numItem - 1; i > 0 && array[i - 1] > newElement; i--){
            array[i] = array[i - 1];
        }
        array[i] = newElement;
    }
}
