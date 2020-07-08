package io.github.w7mikie.searchAlgorithms;


public class AmstrongNumber {

    public static void main(String[] args) {


    }


    public static int numberOfIntDigits(int num) {
        int digits = 0;

        do {
            digits++;
        }while ((num /= 10) != 0);

        return digits;
    }
}
