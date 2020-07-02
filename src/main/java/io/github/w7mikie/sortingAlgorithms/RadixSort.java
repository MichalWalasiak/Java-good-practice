package io.github.w7mikie.sortingAlgorithms;

public class RadixSort {

    public static void main(String[] args) {

        int[] ints = {1545, 7485, 1441, 1441, 5458};

        radixSort(ints, 10, 4);

        for (int i = 0; i < ints.length; i++){
            System.out.println(ints[i]);
        }
    }

    public static void radixSort(int[] arraay, int radix, int width) {
            for (int i = 0; i < width; i++){
                radixSingleSort(arraay, i, radix);
            }
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
