package com.LeetCodePractise;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= rowIndex+1; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j==0 || j==i-1) {
                    row.add(1);
                }else{
                    row.add(result.get(i-2).get(j)+result.get(i-2).get(j-1));
                }
            }
            result.add(row);
        }
        return result.get(rowIndex);
    }

    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        ans = getRow(0);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
        }
    }
}
