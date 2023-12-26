package com.BasicQuestions;

import java.util.Arrays;
import java.util.Set;

import java.util.HashMap;

public class StringAnagram {

    public static boolean checkAnagramWithSorting(char [] st1, char [] st2){
        if (st1.length != st2.length) {
            return false;
        }

        Arrays.sort(st1);
        Arrays.sort(st2);

        for (int i = 0; i < st2.length; i++) {
            if (st1[i] != st2[i]) {
                return false;
            }    
        }

        return true;
    }

    public static boolean checkAnagramWithHashmap(String st1, String st2){
        //check length of both char
        if (st1.length() != st2.length()) {
            return false;
        }
        HashMap <Character, Integer> map = new HashMap<>();
        //use hasmap to store data and increase a key value with st1
        for (int i = 0; i < st1.length(); i++) {
            if (map.containsKey(st1.charAt(i))) {
                map.put(st1.charAt(i), map.get(st1.charAt(i))+1);
            }
            else{
                map.put(st1.charAt(i), 1);
            }
        }
        //use secode char to decrease the key value
        for (int i = 0; i < st1.length(); i++) {
            if (map.containsKey(st1.charAt(i))) {
                map.put(st1.charAt(i), map.get(st1.charAt(i))-1);
            }
        }
        //check if all the key value has 0 or not
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            System.out.println("Data:"+key+" Value:"+map.get(key));
            if (map.get(key) != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        // char str1[] = { 't', 'e', 's', 't' }; 
        // char str2[] = { 't', 'e', 't', 's' }; 
        // System.out.println(checkAnagramWithSorting(str1, str2));

        String string1 = "geeksforgeeks";
        String string2 = "forgeeksgeeks";
        System.out.println(checkAnagramWithHashmap(string1, string2));
    }
}
