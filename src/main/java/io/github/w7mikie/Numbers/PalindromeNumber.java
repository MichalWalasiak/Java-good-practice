package io.github.w7mikie.Numbers;

public class PalindromeNumber {

    public static void main(String[] args) {

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(323));

    }

    public boolean isPalindromeNumber(Integer input) {
        String palindrome = new StringBuilder().append(Math.abs(input)).reverse().toString();
        Integer isPalindrome = Integer.parseInt(palindrome);

        return input.equals(isPalindrome);
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
        return input.equals(palindrom);
    }
}
