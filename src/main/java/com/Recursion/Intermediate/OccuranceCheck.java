package com.Recursion.Intermediate;

public class OccuranceCheck {
    public static int first = -1;
    public static int last = -1;

    public static void main(String[] args) {
        findOccurance("baacdaefaah", 0, 'a');
    }

    public static void findOccurance(String str, int index, char theChar){

        if (index == str.length()-1) {
            System.out.println("First: "+first);
            System.out.println("Last : "+ last);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == theChar) {
            if (first == -1) {
                first = index;
            }
            else{
                last = index;
            }
        }
        findOccurance(str, index+1, theChar);
    }
}
