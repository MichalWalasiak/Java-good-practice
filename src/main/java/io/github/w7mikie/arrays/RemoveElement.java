package io.github.w7mikie.arrays;

public class RemoveElement {

    public static void main(String[] args) {


    }

    public int removeElement(int[] input, int val) {
        int i = 0;
        for (int j = 0; j < input.length; j++){
            if (input[j] != val){
                input[i] = input[j];
                i++;
            }
        }
        return i;

    }
}
