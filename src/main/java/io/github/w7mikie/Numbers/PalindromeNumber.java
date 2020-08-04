package io.github.w7mikie.Numbers;

public class PalindromeNumber {

    public static void main(String[] args) {



    }

    public boolean isNumberPalindrome(Integer input) {
        String palindrome = new StringBuilder().append(Math.abs(input)).reverse().toString();
        Integer isPalindrome = Integer.parseInt(palindrome);

        if (input.equals(isPalindrome)){
            return true;
        }
        return false;
    }

    public boolean isPalindrome(Integer input) {
        if (input < 0){
            return false;
        }
        int palindrom = 0;
        int mockInput = input;
        while (mockInput != 0) {

            palindrom = palindrom * 10 + mockInput % 10;
            mockInput = mockInput / 10;
        }

        if (input.equals(palindrom)){
            return true;
        }
        return false;
    }
}
