package io.github.w7mikie.Numbers;

public class Numbers {

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        System.out.println(numbers.reverseWithString(54874));


    }
    public Integer reverseInteger(Integer input) {
        Integer reverse = 0;

        while (input != 0) {
            reverse = reverse * 10 + input % 10;
            input = input / 10;
        }

        return reverse;
    }

    public Integer reverseWithString(Integer input) {
        String reverse = new StringBuilder().append(Math.abs(input)).reverse().toString();
        try {
            return (input < 0) ? Integer.parseInt(reverse) * -1 : Integer.parseInt(reverse);
        }catch (NumberFormatException e){
            return 0;
        }
    }
}
