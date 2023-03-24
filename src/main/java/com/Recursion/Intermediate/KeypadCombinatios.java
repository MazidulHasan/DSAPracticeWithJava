package com.Recursion.Intermediate;

public class KeypadCombinatios {
    public static String [] keypad = {".", "abc", "def", "ghi", "ijk","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) {
        printCombinations("23", 0, "");
    }

    public static void printCombinations(String str, int index, String combinations){
        
        if (index == str.length()) {
            System.out.println(combinations);
            return;
        }
        
        char currentChar = str.charAt(index);
        String mapping = keypad[currentChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombinations(str, index+1, combinations+mapping.charAt(i));
        }
    }
}
