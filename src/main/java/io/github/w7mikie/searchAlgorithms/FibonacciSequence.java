package io.github.w7mikie.searchAlgorithms;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {

        int w = 0, x = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("type the requested sequence length");
        int count = scanner.nextInt();

        System.out.println("The result of fibonacci sequence is");
        System.out.print(w + " " + x);

        for (int z = 2; z < count; z++){
            int y = w + x;
            System.out.print(" " + y);
            w = x;
            x = y;
        }
    }
}
