package com.LeetCodePractise;

public class isPalindrome {

    public static boolean isPalindromeChecker(int x) {
        String str = String.valueOf(x);
        String reverse="";
        char array[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);            
        }
        System.out.println(str);
        for (int i = array.length-1; i >= 0; i--) {
            reverse+=array[i];
        }
        System.out.println(reverse);
        if (str.equals(reverse)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeChecker(1112111));
    }
}
