package com.AlphaReady.Recursion;

public class TilingProblem {
    public static int titlingProblem(int n){ // 2 x n (floor size)
        //base case
        if (n ==0 || n==1 ) {
            return 1;
        }

        //need to choose vertical or horizontal
        
        //vertical choice
        int fnm1 = titlingProblem(n-1);

        //horizontal choice
        int fnm2 = titlingProblem(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(titlingProblem(4));
    }
}
