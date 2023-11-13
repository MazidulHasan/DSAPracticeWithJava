package com.AlphaReady.BackTracking;

public class FindSubsetOfStringUsingBacktracking {

    public static void findSubSet(String str, String ans, int i){
        //Base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        //Yes choice
        findSubSet(str, ans+str.charAt(i), i+1);
        //No choice
        findSubSet(str, ans, i+1);
    }
    public static void main(String[] args) {
        String s = "abc";
        findSubSet(s, "", 0);
    }
}
