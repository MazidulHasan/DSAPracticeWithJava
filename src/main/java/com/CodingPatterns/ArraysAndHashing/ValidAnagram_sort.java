package com.CodingPatterns.ArraysAndHashing;

import java.util.Arrays;

public class ValidAnagram_sort {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
    public static void main(String[] args) {
        String s = "anagvram", t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
