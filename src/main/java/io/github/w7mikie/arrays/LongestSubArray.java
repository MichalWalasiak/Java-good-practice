package io.github.w7mikie.arrays;

public class LongestSubArray {

    public static void main(String[] args) {

        int[] income = {4, 1, 4, -5, -12, 7, 7, 7};

        LongestSubArray longestSubArray = new LongestSubArray();
        System.out.println(longestSubArray.getLongestSubArray(income, income.length));

    }

    public int getLongestSubArray(int[] input, int size) {
         int maxSoFar = 0, maxEndingHere = 0;

         for (int i = 0; i < size; i++){

             maxEndingHere = maxEndingHere + input[i];
             if (maxEndingHere < 0){
                 maxEndingHere = 0;
             }else if (maxSoFar < maxEndingHere){
                 maxSoFar = maxEndingHere;
             }
         }
         return maxSoFar;
    }
}
