package com.BasicQuestions;

import java.util.Arrays;

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
    public static void main(String[] args) {
        char str1[] = { 't', 'e', 's', 't' }; 
        char str2[] = { 't', 'e', 't', 's' }; 
        System.out.println(checkAnagramWithSorting(str1, str2));
    }
}
