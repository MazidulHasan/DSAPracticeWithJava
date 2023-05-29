package com.LeetCodePractise;
import java.util.*;

public class Letter_Combinations_of_a_Phone_Number {

    public static List<String> letterCombination(String digits){
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }

        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");

        backtrack(digits,0,hm, new StringBuilder(), ans);
        return ans;
    }

    private static void backtrack(String digits, int i, HashMap<Character, String> hm, StringBuilder sb, List<String>ans){
        if (i == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        String curr =  hm.get(digits.charAt(i));
        for (int j = 0; j < curr.length(); j++) {
            sb.append(curr.charAt(j));
            backtrack(digits, i+1, hm,sb,ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Check");
        letterCombination("24");
    }
}
