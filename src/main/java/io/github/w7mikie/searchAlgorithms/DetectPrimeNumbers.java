package io.github.w7mikie.searchAlgorithms;

import java.util.Scanner;

public class DetectPrimeNumbers {

    public static void main(String[] args) {

        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("type the number to check if it is prime");
        int num = scanner.nextInt();

        for (int x = 2; x < num; x++){
            if (num % x == 0){
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println(num + " is a prime number");
        }
        else
            System.out.println(num + " is not a prime number");
    }
}
