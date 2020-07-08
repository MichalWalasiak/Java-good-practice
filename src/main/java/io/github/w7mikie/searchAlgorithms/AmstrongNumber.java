package io.github.w7mikie.searchAlgorithms;


import java.util.Scanner;

public class AmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a positive number");

        double z = 0;
        int x = scanner.nextInt();
        int y = x;

        while (y != 0){
            int ams = y % 10;
            z = z + Math.pow(ams, numberOfIntDigits(x));
            y = y / 10;
        }
        if (z == x){
            System.out.println(x + " is an Amstrong number");
        }else{
            System.out.println(x + " is not an Amstrong number");
        }
    }


    public static int numberOfIntDigits(int num) {
        int digits = 0;

        do {
            digits++;
        }while ((num /= 10) != 0);

        return digits;
    }
}
