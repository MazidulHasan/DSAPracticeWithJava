package com.Recursion.Intermediate;

public class RemoveDuplicateFromString {

    public static boolean [] map = new boolean[26]; //as the english alphabate has 26 char

    public static void main(String[] args) {
        removeDuplicate("aabskrajkdsadaa", 0, "");
    }

    public static void removeDuplicate(String str, int index, String newString){

        if (index == str.length()-1) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        System.out.println("Current Char : "+ currentChar+ " and : "+map[currentChar - 'a' ]);
        if (map[currentChar - 'a' ] != true) {
            newString += currentChar;
            map[currentChar - 'a' ] = true;
        }
        removeDuplicate(str, index+1, newString);
    }
}
