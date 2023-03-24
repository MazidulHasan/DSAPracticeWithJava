package com.Recursion.Intermediate;

public class PrintStringInReverse {
 public static void main(String[] args) {

   String str = "ABCDEFGH";
   printStringInReverse(str,str.length()-1);
 }   
 public static void printStringInReverse(String input, int length){
    if (length == 0) {
        System.out.println(input.charAt(0));
        return;
    }

    System.out.println(input.charAt(length));
    printStringInReverse(input, length-1);
 }
}
