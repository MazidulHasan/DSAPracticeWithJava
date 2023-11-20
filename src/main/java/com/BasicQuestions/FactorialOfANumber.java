package com.BasicQuestions;

public class FactorialOfANumber {
    public static int factorialOfGivenNumber(int number){
        if (number == 0) {
            return 1;
        }

        return (number * factorialOfGivenNumber(number-1));
    }
    public static void main(String[] args) {
        System.out.println(factorialOfGivenNumber(4));
    }
}
