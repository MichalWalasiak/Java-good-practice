package io.github.w7mikie.string;

public class LongestLastWord {

    public static void main(String[] args) {

        LongestLastWord longestLastWord = new LongestLastWord();
        String given = "vo dslk dscmdl fkdd";
        System.out.println(longestLastWord.findLastWordLength(given));

    }

    public int findLastWordLength(String givenWord) {

        String[] income = givenWord.split(" ");

        if (income.length < 0){
            return 0;
        }
        String lastWord = income[income.length - 1];
        return lastWord.length();
    }
}
