package com.CodingPatterns.ArraysAndHashing;

import java.util.HashMap;

public class ValidAnagram_hash {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> sMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0) + 1);
            sMap.put(t.charAt(i),sMap.getOrDefault(t.charAt(i),0) - 1);
        }

        for (char c : sMap.keySet()) {
            if (sMap.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
