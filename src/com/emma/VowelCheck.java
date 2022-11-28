package com.emma;

public class VowelCheck {

    public static boolean containsVowel(String input){

        return input.toLowerCase().matches(".*[aeiou].*");
    }

}
