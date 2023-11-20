package com.BasicQuestions;

public class FibonacchiSeries {
    static int n1=0, n2=1, n3=0;
    public static void printFibonacchi(int uptoNumber){
        if (uptoNumber > 0) {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            printFibonacchi(uptoNumber-1);
        }
    }
    public static void main(String[] args) {
        int count = 10;
        System.out.println(n1);
        System.out.println(n2);
        printFibonacchi(count-2);
    }
}
