package io.github.w7mikie.string;

public class ConvertString {

    public static void main(String[] args) {



    }

    public static boolean StringConvertToBoolean(String str) {
        if (!(str.equals("True") || str.equals("False"))){
            throw new IllegalArgumentException("wrong argument");
        }

        boolean bol = Boolean.parseBoolean(str);

        if (bol){
            System.out.println("value of bol is true");
        }else
            System.out.println("value of bol is false");

        return bol;
    }

    public static int StringConvertToInteger(String str) {

        Integer num = Integer.valueOf(str);
        return num;
    }
}
