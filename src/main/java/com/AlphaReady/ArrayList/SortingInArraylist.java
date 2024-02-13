package com.AlphaReady.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingInArraylist {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.add(2);
         list.add(5);
         list.add(8);
         list.add(1);
         list.add(3);
         System.out.println(list);
         Collections.sort(list); //ascending order
         System.out.println(list);
         Collections.sort(list,Collections.reverseOrder()); //descending order
         System.out.println(list);
    }
}
