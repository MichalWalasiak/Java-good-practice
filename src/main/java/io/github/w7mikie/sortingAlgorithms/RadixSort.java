package io.github.w7mikie.sortingAlgorithms;

public class RadixSort {

    public static void main(String[] args) {

    }

    public static void radixSingleSort(int[] array, int position, int radix) {
            int numItems = array.length;
            int[] countArray = new int[radix];

            for (int value: array){
                countArray[getDigit(position, value, radix)]++;
            }

            for(int j = 1; j < radix; j++){
                countArray[j] += countArray[j - 1];
            }

            int[]temp = new int[numItems];
            for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
                temp[--countArray[getDigit(position, array[tempIndex], radix)]] = array[tempIndex];
            }

            for (int tempIndex = 0; tempIndex < numItems; tempIndex++){
                array[tempIndex] = temp[tempIndex];
            }

    }

    public static int getDigit(int position, int value, int radix) {
        return  value / (int) Math.pow(radix, position) % radix;
    }
}
