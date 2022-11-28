package com.emma;

public class RecursiveFibonacci {

    public static int recusriveFibonacci(int count){
        if (count <= 1){
            return count;
        }
        return recusriveFibonacci(count -1) + recusriveFibonacci(count-2);

    }

}
