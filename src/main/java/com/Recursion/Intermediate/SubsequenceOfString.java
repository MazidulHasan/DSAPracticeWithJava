package com.Recursion.Intermediate;

public class SubsequenceOfString {
    public static void main(String[] args) {
        subsequence("abcefgh", 0, "");
    }

    public static void subsequence(String str, int index, String newString){
        
        if (index  == str.length()) {
            System.out.println(newString);
            return;
        }
        
        char currentChar = str.charAt(index);
        subsequence(str, index+1, newString+currentChar);
        subsequence(str, index+1, newString);
    }
}
