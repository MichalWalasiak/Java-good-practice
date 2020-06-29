package io.hithub.w7mikie.sortingAlgorithms;

public class BubbleSort {

    public static void main(String[] args) {

        int[] ints ={-4, 50, 8, -4, 21};

        for(int lastUnsortedIndex = ints.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if (ints[i] > ints[i+1]){
                    swap(ints, i, i+1);
                }
            }
        }

        for(int i = 0; i < ints.length; i++){
            System.out.println(ints[i]);
        }
    }

    static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}