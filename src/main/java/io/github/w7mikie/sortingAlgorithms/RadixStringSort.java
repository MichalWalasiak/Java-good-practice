package io.github.w7mikie.sortingAlgorithms;

public class RadixStringSort {

    public static void main(String[] args) {

    }

    public static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }
}
