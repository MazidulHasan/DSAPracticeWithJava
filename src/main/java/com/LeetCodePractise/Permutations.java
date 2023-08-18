package com.LeetCodePractise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations {
    
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        int rSize;
        result.add(new ArrayList<Integer>());

        for (int num : nums) {
            rSize = result.size();

            while (rSize>0) {
                List<Integer> permutation = result.pollFirst();
                for (int i = 0; i <= permutation.size(); i++) {
                    List<Integer> newPermutation = new ArrayList<Integer>(permutation);
                    newPermutation.add(i, num);
                    result.add(newPermutation);
                }
                rSize --;
            }
        }
        return result;
    }
}
