package com.LeetCodePractise;

import java.util.Arrays;

public class kokoEatingBanana {

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 0;
        int high = Arrays.stream(piles).max().getAsInt();
        
        while (low < high) {
            int mid = low + (high - low )/2;
            if (isPossible(piles, mid, h)) {
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean isPossible(int[] piles , int x, int h){
        if (x == 0) {
            return false;
        }
        int count = 0;

        for (int i = 0; i < piles.length; i++) {
            count += piles[i] /x;
            if (piles[i] % x !=0) count ++;
        }

        return count<=h;
    }

    public static void main(String[] args) {
        int [] piles = {3,6,7,11};
        System.out.println(minEatingSpeed(piles,8));
    }
}
