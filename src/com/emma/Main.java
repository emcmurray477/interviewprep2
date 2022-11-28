package com.emma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String input = "Ema";
        System.out.println(CheckDuplicates.isDuplicate(input));
        System.out.println(Reverse.reverse(input));

       //swap integers
        int a = 2;
        int b = 3;

        b = a + b;
        a =  b - a;
        b = b - a;

        System.out.println("a = " + a + " b = " + b);

        //vowelCheck
        String string1 = "Hello";
        String string2 = "tv";


        System.out.println("String1 contains vowel: " + VowelCheck.containsVowel(string1));
        System.out.println("String2 contains vowel: " + VowelCheck.containsVowel(string2));

        //prime check
        int num1 = 19;
        int num2 = 49;

        System.out.println(num1 + " is a prime number " + IsPrime.isPrime(num1));
        System.out.println(num2 + " is a prime number " + IsPrime.isPrime(num2));

        //print fibonacci
        PrintFibonacci.printFibonacci(10);

        //recursive fibonacci
        int seqLength = 10;
        System.out.println("A fibonacci sequence of " + seqLength + "numbers: ");

        for(int i = 0; i<seqLength; i++){
            System.out.println(RecursiveFibonacci.recusriveFibonacci(i) + "");
        }

        //is odd
        List<Integer> numList = new ArrayList();

        numList.add(1);
        numList.add(5);
        numList.add(3);
        numList.add(7);
        numList.add(8);


       // System.out.println("List contains only odd integers: " + IsOdd.isOdd(numList));

        System.out.println("List contains only odd integers: " + IsOdd.isOddParallelStream(numList));

        //check for pallindrome
        String string = "hello";
        System.out.println(input + " is palindrome? " + Pallindrome.isPalindrome(string));

        //remove Whitespace
        String input2 = "H E L L O";
        System.out.println("whitepsace removed " +  RemoveWhitespace.removeWhitespace(input2));

        //remove trailing and leading spaces of string
        String leading = "   Hello";
        String trailing = "Hello   ";

        System.out.println("before removing leading spaces " + leading.strip());

        System.out.println("before removing  leading spaces " + leading.strip());

        System.out.println("removed leading spaces " + trailing.strip());

        System.out.println("removed trailing: " + trailing.strip());

        //array sorting
        int[] intArray = {1, 4,-1, 0 ,2 ,5};

        for(int i = 0; i< intArray.length; i++){
            System.out.println(intArray[i]);

        }
        Arrays.sort(intArray);

        for(int i = 0; i< intArray.length; i++){
            System.out.println(intArray[i]);

        }

    }

}