package com.Recursion.Intermediate;

public class MoveStringElement {
    public static void main(String[] args) {
        moveStringElementToLast("Tchcis ac stcrcing check", 0, 'c', 0, "");
    }

    public static void moveStringElementToLast(String str, int index, char find, int count, String newString){
        if (index == str.length()-1) {
            for (int i = 0; i < count; i++) {
                System.out.println("count: is "+count+ "  out of "+ i);
                newString = newString + find;
            }
            for (int i = 0; i < newString.length(); i++) {
                System.out.print(newString.charAt(i));
            }
            return;
        }
        
        if (str.charAt(index) != find) {
            newString = newString + str.charAt(index);
        }
        else{
            count++;
        }
        moveStringElementToLast(str, index+1, find, count, newString);
    }
}
