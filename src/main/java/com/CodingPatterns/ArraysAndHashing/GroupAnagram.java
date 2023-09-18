package com.CodingPatterns.ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
          char charStr[] = s.toCharArray();
          Arrays.sort(charStr);
          String newStr = new String(charStr);
          if (!map.containsKey(newStr)) {
            map.put(newStr, new LinkedList<String>());
          }
          map.get(newStr).add(s);
        }

        return new LinkedList<>(map.values());
    }    

    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);
    }
}
