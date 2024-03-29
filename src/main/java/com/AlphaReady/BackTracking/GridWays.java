package com.AlphaReady.BackTracking;


//find the number of ways to reach from (0,0) ti (N-1,M-1) 
// in a N*M Grid. Allow moives - right or down

public class GridWays {
    public static int gridWays(int i, int j, int n, int m){

        if (i==n-1 && j==m-1) {
            return 1;
        }else if(i ==n || j==n){
            return 0;
        }
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n=10, m=10;
        System.out.println(gridWays(0,0,n,m));
    }
}
