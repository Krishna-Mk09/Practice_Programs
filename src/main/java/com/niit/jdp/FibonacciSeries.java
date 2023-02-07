package com.niit.jdp;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();
        int result = fibonacciSeries.FibonacciSeries(number);
        System.out.println(result);
    }

    public int FibonacciSeries(int number) {
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println(firstNumber + " " + secondNumber);
        int thirdNumber = firstNumber + secondNumber;
        for (int i = 0; i < 10; i++) {
            thirdNumber = firstNumber + secondNumber;
            System.out.println(thirdNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }

        return secondNumber;
    }
}
