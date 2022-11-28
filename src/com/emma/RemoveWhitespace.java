package com.emma;

public class RemoveWhitespace {

    public static String removeWhitespace(String input){
        String result;
        StringBuilder sb = new StringBuilder();
        char[] charArray = input.toCharArray();

        for(char c : charArray){
            if(!Character.isWhitespace(c)){
                sb.append(c);
            }
        }
        return result = sb.toString();
    }
}
