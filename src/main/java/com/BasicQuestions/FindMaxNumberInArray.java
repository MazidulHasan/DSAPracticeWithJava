package com.BasicQuestions;

public class FindMaxNumberInArray {

    public static int searchMaxNumber(int [] array){
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public static int searhMaxNumberFromStringNumber(String sArray){
        String [] stringArray = sArray.split(",");
        int maxNumber =  Integer.parseInt(stringArray[0]);
        for (int i = 0; i < stringArray.length; i++) {
            if (Integer.parseInt(stringArray[i]) > maxNumber) {
                maxNumber = Integer.parseInt(stringArray[i]);
            }
        }
        return maxNumber;
    }
    public static void main(String[] args) {
        // int [] array = {3,1,3,6,8,0,4,77,23,65,7};
        // System.out.println(searchMaxNumber(array));
        String numbers = "12,3,5,7,9,234,6";
        System.out.println(searhMaxNumberFromStringNumber(numbers));
    }
}
