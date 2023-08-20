package com.LeetCodePractise;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String>output_arr = new ArrayList<>();
        backtracking(output_arr,"",0,0,n);
        return output_arr;
    }
    public void backtracking(List<String> output_arr, String currString, int open, int close, int max){
        if (currString.length() == max*2) {  //base case
            output_arr.add((currString));
            return;
        }

        if (open < max) {
            backtracking(output_arr, currString+"(", open+1, close, max);
        }
        if (close < open) {
            backtracking(output_arr, currString+")", open, close+1, max);
        }
    }
}
