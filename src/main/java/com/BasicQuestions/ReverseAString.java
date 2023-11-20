package com.BasicQuestions;

public class ReverseAString {
    public static void reverseString(String s){
        String ans = "";
        for (int i = s.length()-1; i >= 0; i--) {
            ans = ans + s.charAt(i);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String s = "Another";
        reverseString(s);
    }
}
