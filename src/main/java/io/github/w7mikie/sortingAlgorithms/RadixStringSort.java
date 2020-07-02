package io.github.w7mikie.sortingAlgorithms;

public class RadixStringSort {

    public static void main(String[] args) {

    }

    public static void radixStringSort(String[] array, int radix, int width) {
            for (int i = width - 1; i >= 0; i--){
                radixStringSingleSort(array, i, radix);
            }
    }

    public static void radixStringSingleSort(String[] array, int position, int radix) {
        int numItems = array.length;
        int[] countArray = new int[radix];

        for (String value: array){
            countArray[getIndex(position, value)]++;
        }

        for(int j = 1; j < radix; j--){
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getIndex(position, array[tempIndex])]] = array[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++){
            array[tempIndex] = temp[tempIndex];
        }
    }

    public static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }
}
