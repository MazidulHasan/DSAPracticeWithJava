package com.AlphaReady.ArrayList;

import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(33);
        list.add(66);
        list.add(568);
        list.add(12);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }

            //can also use like this
            // max = Math.max(max, list.get(i));
        }
        System.out.println("Max element is : "+ max);

        
    }
}
