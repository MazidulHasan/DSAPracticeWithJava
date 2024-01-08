package com.AlphaReady.ArrayList;

import java.util.ArrayList;

public class BasicArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(2));
        list.set(2, 15);
        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.contains(112));
        System.out.println("Size is:"+list.size());

        System.out.println("Print all data");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
