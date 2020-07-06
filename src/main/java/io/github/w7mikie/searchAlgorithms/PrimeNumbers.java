package io.github.w7mikie.searchAlgorithms;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("type number to print it's prime numbers");
        int num1 = scanner.nextInt();

        for (int x = 1; x <= num1; x++){
            int primeCount = 0;

            for (int num = x; num >= 1; num--){
                if (x % num == 0){
                    primeCount = primeCount + 1;
                }
            }

            if (primeCount == 2){
                System.out.println("prime number is " + x);
            }
        }
    }
}
