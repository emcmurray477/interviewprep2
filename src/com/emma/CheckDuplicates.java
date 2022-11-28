package com.emma;

public class CheckDuplicates {

    public static boolean isDuplicate(String input) {

        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
