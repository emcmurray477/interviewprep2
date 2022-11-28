package com.emma;

import java.util.List;

public class IsOdd {

    public static boolean isOdd(List<Integer> numList){
        for (int i : numList){
            if(i % 2 == 0){
                return false;
            }
        }
        return true;

    }

    public static boolean isOddParallelStream(List<Integer> numList){
        return numList.parallelStream().allMatch(x -> x % 2 !=0);
    }
}
