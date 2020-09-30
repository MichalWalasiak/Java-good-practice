package io.github.w7mikie.arrays;

import java.util.Arrays;

public class AdOne {

    public static void main(String[] args) {

        int[] input = {4, 5, 2};
        int[] secondInput;

        AdOne adOne = new AdOne();
        secondInput = adOne.getOneAdded(input);
        System.out.println(Arrays.toString(secondInput));

    }

    public int[] getOneAdded(int[] input) {
        if (input.length > 0){
            int len = input.length;
            int carry = 1;

            for (int i = len - 1; i >= 0; i--){
                int sum = input[i] + carry;
                input[i] = sum > 9? sum - 10 : sum;
                carry = sum > 9? 1 : 0;
            }

            if (carry ==1){
                int[] newInput = new int[len + 1];
                newInput[0] = 1;
                for (int i = 1; i < len + 1; i++){
                    newInput[i] = input[i-1];
                }
                return newInput;
            }
        }
        return input;
    }
}
