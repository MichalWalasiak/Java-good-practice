package io.github.w7mikie.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {


    }

    public int removeAllDuplicates(int[] input) {
        if (input.length == 0){
            return 0;
        }

        int i = 0;
        for (int j = 1; j < input.length; j++){
            if (input[j] != input[i]){
                i++;
                input[i] = input[j];
            }
        }
        return i + 1;
    }
}
