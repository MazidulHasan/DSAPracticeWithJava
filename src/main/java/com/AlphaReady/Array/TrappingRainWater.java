package com.AlphaReady.Array;

public class TrappingRainWater {
    public static int trappedRainWater(int height[]){
        //calculate left max boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calculate right max boundary
        int rightMax[] = new int[height.length];
        rightMax[rightMax.length-1] = height[height.length-1];
        for (int i = height.length-2; i >= 0 ; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop
        int trappedWater =0;
        for (int i = 0; i < height.length; i++) {
            //waterlevel = min(leftmax boundary, rightmax boundary)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            //trapped water = waterlevel - height[i]
            trappedWater += waterlevel-height[i];
        }
        return trappedWater;

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5,};
        System.out.println(trappedRainWater(height));
    }

}
