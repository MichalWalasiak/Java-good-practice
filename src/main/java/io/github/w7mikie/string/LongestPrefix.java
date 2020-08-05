package io.github.w7mikie.string;

public class LongestPrefix {

    public static void main(String[] args) {


    }

    public String longestCommonPrefix(String[] args) {
        if (args.length == 0){
            return "";
        }
        String prefix = args[0];
        for(int i = 1; i < args.length; i++){
            while (args[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
