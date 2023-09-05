package com.AlphaReady.Recursion;

public class print_x_pow_n {
    public static int power(int x, int n){
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
