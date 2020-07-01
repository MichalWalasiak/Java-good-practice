package io.github.w7mikie.sortingAlgorithms;

public class ShellSort {

    public static void main(String[] args) {

        int[] ints = {7, 4, 24, -4, 4, -18};

        for (int gap = ints.length / 2; gap > 0; gap /= 2){
            for (int i = gap; i < ints.length; i++){

                int newElement = ints[i];
                int j = i;

                while (j >= gap && ints[j - gap] > newElement){
                        ints[j] = ints[j - gap];
                        j -= gap;
                }

                ints[j] = newElement;
            }
        }

        for (int i = 0; i < ints.length; i++){
            System.out.println(ints[i]);
        }
    }
}
