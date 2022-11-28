package com.emma;

public class Reverse {

    public static String reverse(String input){

        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = input.length() -1; i >= 0; i--){
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
