package com.BasicQuestions;

public class IsPalindrom {
    public static boolean isPalindromInNative(String s){
        String reverseString = "";
        for (int i = s.length()-1; i >= 0; i--) {
            reverseString = reverseString + s.charAt(i);
        }

        if (s.equals(reverseString)) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean isPalindromInTwoPointer(String s){
        int i =0;
        int j = s.length()-1;

        while (i<j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean recursionCheck(int i, int j, String s){

        //base case
        if (i>=j) {
            return true;
        }

        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        
        return recursionCheck(i+1, j-1, s);
    }
    public static boolean isPalindromInRecursion(String s){
        return recursionCheck(0,s.length()-1,s);
    }

    public static void main(String[] args) {
        if (isPalindromInRecursion("abba")) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
