package com.AlphaReady.ArrayList;

import java.util.ArrayList;

public class MultiDimentionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> parentList = new ArrayList<>();
        ArrayList<Integer> childList1 = new ArrayList<>();
        childList1.add(1);
        childList1.add(2);
        parentList.add(childList1);

        ArrayList<Integer> childList2 = new ArrayList<>();
        childList2.add(3);
        childList2.add(4);
        parentList.add(childList2);

        for (int i = 0; i < parentList.size(); i++) {
            ArrayList<Integer> cuArrayList = parentList.get(i);
            for (int j = 0; j < cuArrayList.size(); j++) {
                System.out.print(cuArrayList.get(j));
            }
            System.out.println();
        }

        System.out.println(parentList);
    }
}
