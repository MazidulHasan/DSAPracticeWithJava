package com.CodingPatterns.TwoPointers;


public class IsPalindrome {
    public static boolean isPalindrome(String s){
        String lowerCase = s.toLowerCase();
        String cleanString = lowerCase.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("cleanString:::"+cleanString);

        for (int i = 0, j=cleanString.length()-1; i < cleanString.length(); i++, j--) {
            if (cleanString.charAt(i) != cleanString.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        // isPalindrome(s);
        System.out.println(isPalindrome(s));
    }
}
